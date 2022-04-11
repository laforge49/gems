back: [gem](../basics/gem.md#Atoms)

# Sys+ChannelStackAtom

A sys+channelstackatom is a vector of [channels](../basics/channel.md) used to pass asynchronous requests to a [gem](../basics/gem.md).

Gems which have processed any asynchronous requests will have a sys+channelstackatom with at least one channel--its primary channel. [Federated](../basics/federation.md) gems which have a sys+channelstackatom will also have a second channel used when a federation is completed.