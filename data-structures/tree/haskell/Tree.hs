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

--fromList :: [a] -> (Tree a, [a])
--fromList []        = (Empty, [])
--fromList [x]       = (Branch x Empty Empty, [])
--fromList [x, y]    = (Branch x (Branch y Empty Empty) Empty, [])
--fromList [x, y, z] = (Branch x (Branch y Empty Empty) (Branch z Empty Empty), [])
--fromList (x:xs)    = (Branch x

--fromList' :: [a] -> (Tree a, [a])
--fromList [] = Empty
--fromList (x:xs) = 

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

intFromMaybe :: Num a => Maybe a -> a
intFromMaybe (Nothing) = 0
intFromMaybe (Just x)  = x


--------------------------- HEAP ----------------------------------

heapify :: Ord a => Num a => Tree a -> Tree a
heapify (Empty)        = Empty
heapify (Branch x l r) = moveDown (Branch x (heapify l) (heapify r))

-- Study this function for later usage --
moveDown :: Ord a => Num a => Tree a -> Tree a
moveDown (Empty)                                 = Empty
moveDown t@(Branch x Empty Empty)                = t 
moveDown (Branch x (Branch l Empty Empty) Empty) = Branch larger  (Branch smaller  Empty Empty) Empty
    where (larger ,smaller) = if x >= l then (x, l) else (l, x)
moveDown (Branch x Empty (Branch r Empty Empty)) = Branch larger (Branch smaller Empty Empty) Empty
    where (larger, smaller) = if x >= r then (x, r) else (r, x)
moveDown t@(Branch x lft@(Branch y p q) rt@(Branch z r s))
    | x >= y && x >= z = t
    | x <  y && y >= z = Branch y (moveDown (Branch x p q)) rt
    | x <  z && y <  z = Branch z lft (moveDown (Branch x r s))
i------------------------------------------

swapLeft :: Tree a -> Tree a
swapLeft (Empty) = Empty
swapLeft (Branch x l r) = Branch x' l' r
    where x' = head (myFromMaybe (value l))
          l' = Branch x (head (myFromMaybe (left l))) (head (myFromMaybe (right l)))

swapRight :: Tree a -> Tree a
swapRight (Empty) = Empty
swapRight (Branch x l r) = Branch x' l r'
    where x' = head (myFromMaybe (value r))
          r' = Branch x (head (myFromMaybe (left r))) (head (myFromMaybe (right r)))
