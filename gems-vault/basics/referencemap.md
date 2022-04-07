back: [intro](../intro.md#Basics)

# Reference Map

A referencemap is a [persistent map](https://clojure.org/reference/data_structures#Maps). The keys of a reference map are either [prefix](prefix.md)es or [id](basics/id.md)s. And the values of a referencemap are vectors holding both a [fully resolved reference](reference.md#Fully%20Resolved%20References) and a data element, where that data element is typically a scalar, an [id](id.md), a [reference](reference.md) or a referencemap.

Referencemaps are used to implement both [gem](gem.md)s and the [env](env.md).

### Reference Sets

A reference set is simply a reference map with a nil data element.
