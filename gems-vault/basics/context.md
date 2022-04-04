back: [intro](../intro.md)

# Context
Every [gem](basics/gem.md) is under a context, a type of gem, which serves as its [namespace](basics/namespace.md). The one exception to this is the root+sys context. Root is a reserved name and can not be resolved to an [id](basics/id.md).

Except for the root+sys context, every context will import one or more other contexts. The restriction here is that no imported contexts may have the same name, though context names need not be unique. 

Imports are implemented as a vector of context references included in the context data structure. The order of imports is significant and is managed via the prefixes of those references.