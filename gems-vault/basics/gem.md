back: [intro](../intro.md#Basics)

# Gem

Gems are the entities the gems framework. Gems are implemented as [referencemap](referencemap.md)s and can operate asynchronously as individuals or synchronously within a [federation](federation.md). Gems which have received asynchronous requests have an associated [go block](goblock.md) for processing such requests. I.E. Not every gem has an associated go block.

The keys of a gem's contents are the [ids](id.md) of various facets,  including atoms, descriptors, classifiers, and relations.

Every gem is under a [context](context.md), which means that the gem is a part of a context's namespace. The sole exception to this is [root+sys](gems/root+sys.md), as there is no context named root.

### Facets

A gem has multiple facets which are used to organize the contents of a gem. Facets are implemented as [referencemaps](referencemap.md).

- [sys+atomsfacet](../facets/sys+atomsfacet.md)
  - [[../atoms/sys+gemsatom.md]]
- [sys+classifiersfacet](../facets/sys+classifiersfacet.md)
  - [sys contextclassifier](../facets/sys+classifiersfacet.md#sys%20contextclassifier)
  - [sys importclassifiers](../facets/sys+classifiersfacet.md#sys%20importclassifiers)
- [sys+descriptorsfacet](../facets/sys+descriptorsfacet.md)
  - [sys federationdescriptor](../facets/sys+descriptorsfacet.md#sys%20federationdescriptor)

### Atoms

These are the atoms which may be held by any type of gem:

- [sys+channelstackatom](../atoms/sys+channelstackatom.md)