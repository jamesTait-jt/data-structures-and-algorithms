module Tree where

import Data.Maybe
import Queue

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

fromList :: [a] -> Tree a
fromList = undefined

drawTree :: Tree a -> String
drawTree = undefined

dfsToList :: Tree a -> [a]
dfsToList (Leaf x)       = [x]
dfsToList (Branch x l r) = [x] ++ dfsToList l ++ dfsToList r

--bfsToList :: Tree a -> Queue a -> [a]
--bfsToList (Leaf x) q       = enqueue q x
--bfsToList (Branch x l r) q = enqueue (enqueue (enqueue q x) l)i r
