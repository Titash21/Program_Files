'''import sys
product=1
def factorial(n):
	i=1
	while(i<=n):
		product=product*i
	i+=1

if(len(sys.argv)<=0):
	print("Invalid")
else:
	factorial(int(sys.argv[1]))	
	print(product)
'''
import sys
def fact(x):
    if x == 0:
        return 1
    return x * fact(x - 1)

if(len(sys.argv)<=1):
	print("Invalid")
else:
	print(fact(int(sys.argv[1])))	
	