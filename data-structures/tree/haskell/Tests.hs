import Tree
import Test.HUnit

completeTree_7 = Branch 1 
                        (Branch 2
                                (Leaf 3)
                                (Leaf 4))
                        (Branch 5
                                (Leaf 6)
                                (Leaf 7))

completeTree_15 = Branch 1
                         (Branch 2
                                 (Branch 3
                                         (Leaf 4)
                                         (Leaf 5))
                                 (Branch 6
                                         (Leaf 7)
                                         (Leaf 8)))
                         (Branch 9
                                 (Branch 10
                                         (Leaf 11)
                                         (Leaf 12))
                                 (Branch 13
                                         (Leaf 14)
                                         (Leaf 15)))


test1 = TestCase (assertEqual "dfsToList 7" [1 .. 7] (dfsToList completeTree_7))
test2 = TestCase (assertEqual "dfsToList 15" [1 .. 15] (dfsToList completeTree_15))
test3 = TestCase (assertEqual "bfsToList 7" [1, 2, 5, 3, 4, 6, 7] (bfsToList completeTree_7)) 


tests = TestList [ TestLabel "test1" test1
                 , TestLabel "test2" test2
                 , TestLabel "test3" test3 ]
