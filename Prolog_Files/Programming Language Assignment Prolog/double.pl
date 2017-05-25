

%factorial
factorial(0,1).
factorial(1,1).
factorial(N,R):-
			N1 is N-1,
			R is N*N1,
			factorial(N1,R).