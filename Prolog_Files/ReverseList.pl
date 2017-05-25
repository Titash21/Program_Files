%1. reverse a list
%[a,b,c]->[c,b,a]

%reverse(list, rev_List).
reverseList([],[]).  %reverse of empty is empty - base case
reverseList([H|T], RevList):-reverseList(T, RevT), conc(RevT, [H], RevList).