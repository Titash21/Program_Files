import sys

def check_if_Perfect_no(number):
	factors=[]
	#this method checks if the number entered is perfect or not
	i=1
	while(i<=number):
		if(number%i==0):
			factors.append(i)
		i+=1
	factors.remove(number)
	total=sum(factors)
	if(total==number):
	    return True
	else:
	    return False

if(len(sys.argv[1])<1):
	print("Invalid input")
else:
	n = int(sys.argv[1])
	perfect_nos = [i for i in range(1,n+1) if check_if_Perfect_no(i)]
	print(perfect_nos)		