back: [intro](../intro.md#Basics)

# Atom

An [atom](https://clojure.org/reference/atoms) is a wrapper of mutable data (state) that facilitates sharing between [Go blocks](https://clojuredocs.org/clojure.core.async/go). Atoms allow state to be updated atomically, providing the state is all under a single atom.

In the gems framework, atoms are found in [env](basics/env.md) and [gems](basics/gem.md).