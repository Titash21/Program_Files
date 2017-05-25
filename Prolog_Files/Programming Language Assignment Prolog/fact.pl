fact(0,1).
		fact(N,R):- 
					N>0,
					N1 is N-1,
					R1 is N*N1,
					R is R1,
					fact(N1,R).
					
