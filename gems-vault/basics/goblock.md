back: [intro](../intro.md#Basics)

# Go Block

[Go blocks](https://clojuredocs.org/clojure.core.async/go) are light weight threads and are used to process asynchronous requests sent to an atom. Any [gem](gem.md) that has received at least one asynchronous request has an associated go block except when a gem is [federated](federation.md).