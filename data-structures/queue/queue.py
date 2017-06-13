class Queue:
    
    def __init__(self):
        self.data = []
    
    def peek(self):
        return self.data[0]

    def enqueue(self, x):
        self.data = self.data + [x]

    def enqueueBatch(self, x):
        if not isinstance(x, list):
            raise TypeError("Can only add lists with enqueueBatch")
        self.data = self.data + x

    def dequeue(self):
        self.data.pop(0)

    def dequeueBatch(self, n):
        if not isinstance(n, int):
            raise TypeError("Must remove an integer value from the queue")
        if n > len(self.data):
            raise IndexError("Cannot remove en element from an empty queue")
        while n>0:
            self.data.pop(0)
            n -= 1

