module Tree where

import Data.Maybe

data Tree a = Empty
            | Branch a (Tree a) (Tree a)
            deriving (Show)

value :: Tree a -> Maybe a
value (Empty)        = Nothing 
value (Branch x l r) = Just x

left :: Tree a -> Maybe (Tree a)
left (Empty)     = Nothing
left (Branch x l r) = Just l

right :: Tree a -> Maybe (Tree a)
right (Empty)     = Nothing
right (Branch x l r) = Just r

children :: Tree a -> [Tree a]
children (Empty)        = []
children (Branch x l r) = [l, r]

fromList :: [a] -> Tree a
fromList = undefined

drawTree :: Tree a -> String
drawTree = undefined

dfsToList :: Tree a -> [a]
dfsToList (Empty)       = []
dfsToList (Branch x l r) = [x] ++ dfsToList l ++ dfsToList r

bfsToList :: Tree a -> [a]
bfsToList tree = concat $ map myFromMaybe (bfs [tree])
  where 
    bfs :: [Tree a] -> [Maybe a] 
    bfs [] = []
    bfs xs = map value xs ++ bfs (concat $ map children xs)


myFromMaybe :: Maybe a -> [a]
myFromMaybe (Nothing) = []
myFromMaybe (Just x)  = [x]

