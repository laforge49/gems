back: [intro](../intro.md)

# Reference
A reference is a string that contains an optional [prefix](basics/prefix.md), an optional [namespace](basics/namespace.md), a gem [name](basics/name.md) and an optional [rolename](basics/rolename.md). Using the namespace and name, the [id](basics/id.md) of a gem is easily constructed. And when the namespace is not present, the id can be [resolved](basics/context.md#Resolving%20Names) from the name within a given [context](basics/context.md).

The form of a reference is prefix#namespace+name^rolename. The shortest variation is simply a name. Some other variations include
- namespace+name^rolename
- prefix#name^rolename and
- prefix#namespace+name.

A reference is used as a key in a sorted map rather than an id. The prefixes of the keys then are used to control how the contents are sorted. And the gems named by the rolenames are used to process the values.

### Fully Resolved References

A fully resolved reference is a vector with the following items:

- prefix (or nil)
- context id (or nil for root+sys as there is no root context.)
- gem id and
- role id (or nil).

A fully resolved reference is created from a reference string by [resolving](basics/context.md#Resolving%20Names) the elements named in the reference.