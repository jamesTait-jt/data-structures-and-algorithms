# Graph
A graph is an abstract data type that implements the directed (or undirected, as
in our implementation) graph concept from Mathematic graph theory.

A graph structure consists of a finite set of nodes, together with a set of
pairs of these nodes. A pair of nodes is called an edge and can be givem a
weight (Not implemented).

## Functions included

###### adjacent(n1 n2)
The adjacent function returns a boolean value representing whether the nodes n1
and n2 are connected by an edge.

###### addNode(n)
Adds a node n to the graph.

###### removeNode(n)
Removes the node n from the graph.

######  addEdge(n1, n2)
Adds an edge between nodes n1 and n2.

###### removeEdge(n1, n2)
Removes the edge between nodes n1 and n2.

Other included functions are to do with obtaining values, utility and altering the
structure of the node rather than modifying the graph.
