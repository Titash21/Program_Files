%Number of elements in a list
list_length([],0).
list_length([H|T],R):-
					list_length(T,R1), R is R1+1.