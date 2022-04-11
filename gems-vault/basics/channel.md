back: [intro](../intro.md#Basics)

# Channel

A [channel](https://clojure.org/news/2013/06/28/clojure-clore-async-channels) provides a means of sending messages between [goblocks](goblock.md). [Gems](gem.md) which perform asynchronous processing have a primary channel on which they receive requests, with responses typically sent via channels which were embedded in those requests.