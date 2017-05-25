whatGrade:: Int->String
whatGrade age
	| (age>=3) && (age<6)="Kindergarten"
	| (age>=6) && (age<10)="Elementary"
	| otherwise="Go to middle school" 
main= do
	--value <- readLn :: IO Int
	value <- getLine 
	putStrLn $ whatGrade (read value)