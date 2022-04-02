# Environment

The environment is an [immutable map](https://clojure.org/reference/data_structures#Maps), which holds all parameters and state. The environment is held by a local variable rather than being global. The contents of this map are often modified and the new versions are passed as arguments when calling functions in the gems framework. 

In general, the environment is not passed back from a function in a return value. And rather than placing mutable data (state) directly in the environment, it is first wrapped in an [atom](https://clojure.org/reference/atoms) which is then added to the environment. Changes to data are made as side-effects to calling functions in the gems API.

This approach works well with [go blocks](https://clojuredocs.org/clojure.core.async/go), as each go block can be passed parameters specific to that block while being able to access (and update) the mutable data referenced in the environment. Additionally, not all versions of the environment need have the same atoms, so a go block can be limited in scope to just the mutable state that was passed to it.

This is in contrast to a common approach which keeps all mutable data in a map wrapped by a global atom. An approach which clearly violates the old adage that global variables are to be avoided.