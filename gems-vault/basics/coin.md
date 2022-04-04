back: [intro](../intro.md)

# Coin

A coin is an [immutable collection](https://clojure.org/reference/data_structures#Collection). A coin is implemented using both a sorted map and a hash map, which can be thought of as the two faces of a coin. The contents of a coin is a collection of [reference](basics/reference.md)s. These references are keyed by both a reference and an id.