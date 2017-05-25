#Write a program that computes the net amount of a bank account based a transaction log from console in
import sys
netAmount = 0
while True:
	enterValue=input()
	if(enterValue==" "):
		break
	value=[x for x in enterValue.split(" ")]
	if(value[0]=='D'):
		netAmount+=int(value[1])
	if(value[0]=='W'):
		if(netAmount>=int(value[1])):
			netAmount-=int(value[1])
		else:
			print("Value to be withdrawn exceeds the value stored")
	else:
		print("invalid input try again")



print("After transaction the netAmount is",netAmount)