import System.IO
--print last element of a ist
findLast::[Int]->Int
findLast []= error "Empty list"
findLast [x:xs]= findLast xs
main=print $ findLast [1,2,3,4]