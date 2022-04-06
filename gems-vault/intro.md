# Introduction to Gems

Gems is an experimental framework for knowledge applications. The API is intended to be rich in advanced features, but the scope is restricted to a single host and a moderately sized dataset. Multi-threading is supported, and serialization is done using [YAML](https://en.wikipedia.org/wiki/YAML).

Gems is a multi-layered generative system. Each layer has one or more journals of transactions which can be edited to effect changes in the system. These journals are processed layer by layer when regenerating gems. Because a generative process is used to handle updates, deep structural changes are possible.

## Basics

- [name](basics/name.md)
- [namespace](basics/namespace.md)
- [env](basics/env.md)
- [gem](basics/gem.md)
- [id](basics/id.md)
- [reference](basics/reference.md)
- [prefix](basics/prefix.md)
- [rolename](basics/rolename.md)
- [context](basics/context.md)
- [referencemap](basics/referencemap.md)
- [federation](basics/federation.md)
