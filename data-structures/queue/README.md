# Queue

The queue structure acts in much the same way a queue at a till works. The first
item into the queue will be the first item to leave the queue. That is, when an
item is added to a queue, it cannot be removed until every item that was added
before it is removed.

## Functions included

###### enqueue(x)
enqueue will add an item _x_ to the front of the queue.

###### dequeue()
dequeue will remove an item from the back of the queue.

###### enqueueBatch(xs)
enqueueBatch enables you to add multiple items at once.

###### dequeueBatch(n)
dequeueBatch enables you the remove multiple items at once.

###### peek()
peek will return the item at the front of the queue.
