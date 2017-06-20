module Queue where

type Queue a = [a]

enqueue :: Queue a -> a -> Queue a
enqueue [] y = [y] 
enqueue xs y = xs ++ [y]

enqueueBatch :: Queue a -> [a] -> Queue a
enqueueBatch [] ys = ys
enqueueBatch xs ys = xs ++ ys

dequeue :: Queue a -> Queue a
dequeue []     = error "Queue is empty"
dequeue (x:xs) = xs

dequeueBatch :: Queue a -> Int -> Queue a
dequeueBatch xs     0 = xs
dequeueBatch (x:xs) n = if n <= length(x:xs) 
                           then dequeueBatch xs (n - 1)
                           else error "Cannot dequeue more items that the queue contains"

peek :: Queue a -> a
peek []     = error "Queue is empty"
peek (x:xs) = x
