back: [intro](../intro.md)

# Env

Env is the top-level data structure in the gems framework. It is implemented as an immutable hash map, keyed by [keyword](https://clojuredocs.org/clojure.core/keyword)s and holds all parameters and state. Env is in turn held by a local variable rather than being global. The contents of this map are often modified and the new versions are passed as arguments when calling functions in the gems framework. 

In general, the environment is not passed back from a function in a return value. And rather than placing mutable data (state) directly in the environment, all state is first wrapped in an [atom](https://clojure.org/reference/atoms) which is then added to the environment. Changes to data are made as side-effects from calling functions in the gems API.

This approach works well with [go blocks](https://clojuredocs.org/clojure.core.async/go), as each go block can be passed parameters specific for that block while supporting access (and updates) of the mutable data referenced in the environment. Additionally, not all versions of the environment need have the same atoms, so a go block can be limited in scope to just the mutable state that was passed to it.

This is in contrast to a common approach of keeping all mutable data in a map that is wrapped by a global atom--an approach which clearly violates the old adage that global data should be minimized if not entirely avoided.
