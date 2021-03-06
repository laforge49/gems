back: [intro](../intro.md#Basics)

# Federation

A federation is a gem and holds a collection of [gem](gem.md)s which are locked and unlocked in the same locking order as the gems in all other federations. This consistency prevents deadlocks.

Normally a gem is left unlocked and can asynchronously process requests sent by other gems. But while a gem is locked it can interchange synchronous requests only with other gems in the same federation and may not process requests from other gems.

One exception here is a gem which is immutable. Such a gem can not participate in a federation but is free to process read-only requests, synchronously and asynchronously, from all other gems.

When a gem is locked, its [sys+federationdescriptor](../facets/sys+descriptorsfacet.md#sys+federationdescriptor) is set to the [id](id.md) of the federation it is operating under. 
