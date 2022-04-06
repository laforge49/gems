back: [intro](../intro.md#Basics)

# Reference Map

A referencemap is a [persistent map](https://clojure.org/reference/data_structures#Maps). The keys of a reference map are either [prefix](basics/prefix.md)es or [id](basics/id.md)s. And the values of a referencemap are vectors holding both a [fully resolved reference](basics/reference.md#Fully%20Resolved%20References) and a data element, where that data element is typically a scalar, an [id](basics/id.md), a [reference](basics/reference.md) or a referencemap.

Referencemaps are used to implement both [gem](basics/gem.md)s and the [env](basics/env.md).
