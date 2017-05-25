% 1. No last element to remove, fail - stop iteration
remove_last([], []) :- !, fail.

% 2. Only one element in list - return empty list 
remove_last([_], []) :- !.

% 3. If the rules above did not match, preserve the head of the
% list in the result list and recurse...
remove_last([X | T], [X | T2]) :-remove_last(T, T2).