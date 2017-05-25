import System.Environment   
import Data.List  
square :: Int->Int->Int
square x y= ((x^2) + (y^2))

main = do
	(value:value1) <- getArgs
	putStrLn $ (square (read value) (read value1))
