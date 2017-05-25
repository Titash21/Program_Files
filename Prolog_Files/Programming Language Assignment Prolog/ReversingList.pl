%1. reverse a list
%[a,b,c]->[c,b,a]
%Base condition is when the list is empty 
%When the list is empty, we can print the empty list 

reverseList([],R,R).

% Each iteration take the head, append to the start of Acc and run the loop with the remaining
%elements in the tail

reverseList([H|T],R,Var) :- reverseList(T,R,[H|Var]).