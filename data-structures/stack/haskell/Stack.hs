module Stack where

type Stack a = [a]

push :: Stack a -> a -> Stack a
push [] x = [x]
push ys x = x:ys

pop :: Stack a -> Stack a
pop []     = error "Cannot pop from empty stack"
pop (y:ys) = ys

multiPush :: Stack a -> [a] -> Stack a
multiPush ys xs = xs ++ ys

multiPop :: Stack a -> Int -> Stack a
multiPop ys     0 = ys
multiPop (y:ys) n = if n <= length(y:ys)
                       then multiPop ys (n - 1)
                       else error "Cannot pop from empty stack"
