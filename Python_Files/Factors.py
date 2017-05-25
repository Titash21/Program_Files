import sys
factor=[]
def factors(number):
	i=1
	while(i<=number):
		if(number%i==0):
			factor.append(i)	
		i+=1

if(len(sys.argv)<1):
	print("Enter a valid input")
else:
	factors(int(sys.argv[1]))
	print(factor)
	