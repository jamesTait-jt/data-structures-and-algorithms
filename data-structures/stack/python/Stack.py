class Stack:
  
    def __init__(self):
        self.data = []

    def push(self, x):
        self.data.append(x)

    def pop(self):
        if self.data == []:
            raise IndexError("Can only pop from non-empty stack")
        else:
            del self.data[len(self.data) - 1]

    def multiPush(self, xs):
        if not isinstance(xs, list): 
            raise TypeError("Can only add lists with multiPush")
        else:
            self.data = self.data + xs

    def multiPop(self, n):
        if n > len(self.data):
            raise IndexError("Can only pop from non-empty stack")
        else:
            while n > 0:
                del self.data[len(self.data) - 1]
                n -= 1


