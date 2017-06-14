module Tree where

data Tree a = Leaf a
            | Branch a (Tree a) (Tree a)


value :: Tree a -> a
value (Leaf x)       = x
value (Branch x l r) = x

left :: Tree a -> Maybe (Tree a)
left (Leaf x)     = Nothing
left (Branch x l r) = Just l

right :: Tree a -> Maybe (Tree a)
right (Leaf x)     = Nothing
right (Branch x l r) = Just r

dfsToList :: Tree a -> [a]
dfsToList = undefined

bfsToList :: Tree a -> [a]
bfsToList = undefined
