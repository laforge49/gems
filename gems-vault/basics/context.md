back: [intro](../intro.md)

# Context
Every [gem](basics/gem.md) is under a context, a type of gem, which serves as its [namespace](basics/namespace.md). The one exception to this is the root+sys context, which is not under any context. Root is a reserved name and can not be resolved to an [id](basics/id.md).

Except for the root+sys context, every context will import one or more other contexts. The restriction here is that no imported contexts may have the same [name](basics/name.md), though context names need not be unique. 

Imports are implemented as a vector of context references included in the context data structure. The order of imports is significant and is managed via the prefixes of those references.

### Resolving Names

A name is resolved within a given context to the id of a gem by matching the name to the names of the gems under that context and returning the id of the matching gem.

If the search fails, then every imported context is searched recursively until a match is found. If there is still no match, then the id of the given context is returned.
