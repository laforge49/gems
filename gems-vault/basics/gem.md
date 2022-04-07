back: [intro](../intro.md#Basics)

# Gem

Gems are the entities the gems framework. Gems are implemented as [referencemap](basics/referencemap.md)s and can operate asynchronously as individuals or synchronously within a [federation](basics/federation.md).

The keys of a gem's contents are the [ids](basics/id.md) of various facets,  including atoms, descriptors, classifiers, and relations.

Every gem is under a [context](basics/context.md), which means that the gem is a part of a context's namespace. The sole exception to this is [root+sys](gems/root+sys.md), as there is no context named root.

### Facets

- [sys+atomsfacet](facets/sys+atomsfacet.md)
