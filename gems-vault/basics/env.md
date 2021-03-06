back: [intro](../intro.md#Basics)

# Env

Env is the top-level data structure in the gems framework. It is implemented as a [referencemap](referencemap.md), keyed by [id](id.md)s and whose data elements are parameters and atoms. Env is in turn held by a local variable rather than being global. The contents of this map are often modified and the new versions are passed as arguments when calling functions in the gems framework. 

In general, the environment is not passed back from a function in a return value. And rather than placing mutable data (state) directly in the environment, all state is first wrapped in an [atom](atom.md) which is then added to the environment. Changes to data are made as side-effects from calling functions in the gems API.

This approach works well with [go blocks](goblock.md), as each go block can be passed parameters specific for that block while supporting access (and updates) of the mutable data referenced in the environment. Additionally, not all versions of the environment need have the same atoms, so a go block can be limited in scope to just the mutable state that was passed to it.

This is in contrast to a common approach of keeping all mutable data in a map that is wrapped by a global atom--an approach which clearly violates the old adage that global data should be minimized if not entirely avoided.

### Atoms

These are the atoms held by env:

- [sys+gemsatom](../atoms/sys+gemsatom.md)
