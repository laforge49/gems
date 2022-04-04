back: [intro](../intro.md)

# Reference
A reference contains an optional [prefix](basics/prefix.md), an optional namespace, a [name](basics/name.md) and an optional [rolenamex](basics/rolenamex.md). Using the namespace and name, the [id](basics/id.md) of a gem is easily constructed. And when the namespace is not present, the id can be resolved from the name within a given [context](basics/context.md).

The form of a reference is prefix#namespace+name^rolename. The shortest variation is simply a name. Some other variations include
- namespace+name^rolename
- prefix#name^rolename and
- prefix#namespace+name.

A reference is used as a key in a sorted map rather than an id. The prefixes of the keys then are used to control how the contents are sorted. And the gems named by the rolenames are used to process the values.