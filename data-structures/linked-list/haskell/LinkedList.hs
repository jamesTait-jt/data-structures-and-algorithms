data List a = Empty | Cons a (List a) deriving (Show)

append :: List a -> a -> List a
append (Empty) n    = Cons n Empty
append (Cons x l) n =   
