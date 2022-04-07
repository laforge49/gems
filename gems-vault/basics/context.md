back: [intro](../intro.md#Basics)

# Context
Every [gem](gem.md) is under a context, a type of gem, which serves as its [namespace](namespace.md). The one exception to this is the [root+sys](../gems/root+sys.md) context, which is not under any context. (Root is a reserved name and can not be resolved to an [id](id.md)).

Except for the root+sys context, every context will import one or more other contexts. The restriction here is that no two imported contexts may have the same [name](name.md), though context names need not be globally unique. 

Imports are implemented as a [Reference Set](referencemap.md#Reference%20Sets) of context references included in the context data structure. The order of imports is significant and is managed via the prefixes of those references.

### Resolving Names

A name is resolved for a given context id to the id of a gem by matching the name to the names of the gems under that context and returning the id of the matching gem.

If the search fails, then every imported context is searched recursively until a match is found. If there is still no match, then the given context id is returned.

### Atoms

These are the atoms that may be held by the [sys+atomsfacet](../facets/sys+atomsfacet.md) of a context:

- [sys+namespaceatom](../atoms/sys+namespaceatom.md)
