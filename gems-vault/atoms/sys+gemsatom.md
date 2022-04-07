back: [intro](../intro.md#Atoms)

# Sys+GemsAtom

[Env](basics/env.md#Atoms) holds the sys+gemsatom. This atom, in turn, holds an immutable hashmap, keyed by [id](basics/id.md), and  whose contents are all of the actual [gems](basics/gem.md).

Full read/write access to the contents of a gem is restricted to access by the gem itself and to access by other gems when they are part of the same federation.

Read-only access is also allowed to any content of a gem which is invariant.
