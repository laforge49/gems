back: [gem](../basics/gem.md#Facets)

# Sys+ClassifiersFacet

A sys+classifierfacet holds all the classifiers of a [gem](../basics/gem.md). It is immutable and is initialized when a gem is created.

Classifiers are inverted in the [sys+inverseclassifiersatom](../atoms/sys+inverseclassifiersatom.md) of the [contexts](../basics/context.md) for the gems which have a given classifier.

### sys+contextclassifier

The sys+contextclassifier entry in the sys+classifierfacit holds the [id](../basics/id.md) of the context that the gem is under.

### sys+importclassifiers

The sys+importclassifiers entry in a given [context](../basics/context.md) holds an ordered [Reference Set](../basics/referencemap.md#Reference%20Sets) of other contexts imported by the given context.
