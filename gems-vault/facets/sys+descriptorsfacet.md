back: [gem](../basics/gem.md#Facets)

# Sys+DescriptorsFacet

A descriptorsfacet holds all the descriptors of a given [gem](../basics/gem.md). It is mutable, as are the descriptors.

One or more descriptors across multiple gems can be updated atomically when those gems are [federated](../basics/federation.md). This is in contrast to the content of [atoms](../basics/atom.md) which can only be updated individually.

### sys+federationdescriptor

The sys+federationdescriptor entry holds the [id](../basics/id.md) of the federation that gem is operating under. If nil, then the gem can process requests asynchronously.