main = print $ perfectNumber 30

perfectNumber n = [m | m <- [1..n], sum (factors m) == m]
factors n = [t | t <- [1..n-1], n `mod` t == 0]
