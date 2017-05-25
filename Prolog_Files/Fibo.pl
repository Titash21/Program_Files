fib(0, 1) :- !.
fib(1, 1) :- !.
fib(N, FIB) :- fastfib(0, 1, 1, 1, N, FIB).

fastfib(N2, F2, N1, F1, N1, F1) :- !.

fastfib(N2, F2, N1, F1, N, FIB) :-
    NewF is F2+F1,
    NewN is N1+1,
    fastfib(N1, F1, NewN, NewF, N, FIB).