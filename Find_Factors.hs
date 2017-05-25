main = print $ findfactors 30

findfactors n = [x | x <- [1..n], n `mod` x == 0]
