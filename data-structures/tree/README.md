# Tree
A tree is a data structure consisting of a root node and subtrees of children
represented as a set of linked nodes. Each child must only have one parent, and
there are no cycles. for an n-ary tree, each parent has a maximum of n children,
with the tree being complete if each parent has n children, or 0 children if it 
is a leaf.

![alt text](https://upload.wikimedia.org/wikipedia/commons/thumb/f/f7/Binary_tree.svg/1200px-Binary_tree.svg.png "Non-complete Binary Tree")

## Functions included

###### value()
This returns the value stored in a given node

###### left()
Returns the subtree stored at the left child position.

###### right()
Rreturns the subtree stored at the right child position.

###### fromList()
Builds a tree from a list.

###### drawTree()
Returns a 2-dimensional drawing of the tree.

###### dfsToList() 
Returns a list of the nodes via a depth first search.

###### bfsToList()
Returns a list of the nodes via a breadth first search.

