# Introduction to Gems

Gems is an experimental framework for knowledge applications. The API is intended to be rich in advanced features, but the scope is restricted to a single host and a moderately sized dataset. [Go blocks](https://clojuredocs.org/clojure.core.async/go) are used to support multi-threading, and serialization is done using [YAML](https://en.wikipedia.org/wiki/YAML).

### A Generative Approach

Gems is a multi-layered generative system. Each layer has one or more journals of transactions which can be edited to effect changes in the system. These journals are processed layer by layer when regenerating gems. Because a generative process is used to handle updates, deep structural changes are possible.

Why are multiple layers used? As each layer is processed in turn, the result is a fully functional system which is then used to process the next layer. This open the door to extensible applications as well as allowing layers to be reused across multiple applications.

Why are multiple journals supported for each layer? Journals in the same layer are processed as a group, allowing for interdependencies between journals in the same layer. This facilitates the partitioning of the content of these journals with few restrictions.

### Basics

- [name](basics/name.md)
- [namespace](basics/namespace.md)
- [env](basics/env.md)
- [gem](basics/gem.md)
  - [Facets](basics/gem.md#Facets)
- [id](basics/id.md)
- [reference](basics/reference.md)
  - [Fully Resolved References](basics/reference.md#Fully%20Resolved%20References)
- [prefix](basics/prefix.md)
- [rolename](basics/rolename.md)
- [context](basics/context.md)
  - [Resolving Names](basics/context.md#Resolving%20Names)
- [referencemap](basics/referencemap.md)
- [federation](basics/federation.md)

### Atoms

[Atoms](https://clojure.org/reference/atoms) are used to wrap state which may be accessed by more than one go block. These atoms are found in [env](basics/env.md) and [gems](basics/gem.md)

### Gems

- [root+sys](gems/root+sys.md)