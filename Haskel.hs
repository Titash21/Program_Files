  prompt x = do
               putStrLn x
            number <- getLine
            return number

    main = do
            number <- prompt " Please input a number: "
            print $ succ ( read number :: Int)