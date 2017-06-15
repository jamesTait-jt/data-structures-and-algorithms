import Tree
import Test.HUnit

completeTree_3 = Branch 1
                        (Branch 2 Empty Empty)
                        (Branch 3 Empty Empty)

completeTree_7 = Branch 1
                        (Branch 2
                                (Branch 3 Empty Empty)
                                (Branch 4 Empty Empty))
                        (Branch 5
                                (Branch 6 Empty Empty)
                                (Branch 7 Empty Empty))

completeTree_15 = Branch 1
                         (Branch 2
                                 (Branch 3
                                         (Branch 4 Empty Empty)
                                         (Branch 5 Empty Empty))
                                 (Branch 6
                                         (Branch 7 Empty Empty)
                                         (Branch 8 Empty Empty)))
                         (Branch 9
                                 (Branch 10
                                         (Branch 11 Empty Empty)
                                         (Branch 12 Empty Empty))
                                 (Branch 13
                                         (Branch 14 Empty Empty)
                                         (Branch 15 Empty Empty)))


test1 = TestCase (assertEqual "dfsToList 7" [1 .. 7] (dfsToList completeTree_7))
test2 = TestCase (assertEqual "dfsToList 15" [1 .. 15] (dfsToList completeTree_15))

test3 = TestCase (assertEqual "bfsToList 3" [1, 2, 3] (bfsToList completeTree_3))
test4 = TestCase (assertEqual "bfsToList 7" [1, 2, 5, 3, 4, 6, 7] (bfsToList completeTree_7)) 
test5 = TestCase (assertEqual "bfsToList 15" [1, 2, 9, 3, 6, 10, 13, 4, 5, 7, 8, 11, 12, 14, 15] (bfsToList completeTree_15))


tests = TestList [ TestLabel "test1" test1
                 , TestLabel "test2" test2
                 , TestLabel "test3" test3 
                 , TestLabel "test4" test4 
                 , TestLabel "test5" test5 ]
