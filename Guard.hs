whatGrade:: Int->String
	| (age>=3) && (age<6)="Kindergarten"
	| (age>=6) && (age<10)="Elementary"
	| otherwise="Go to middle school" 