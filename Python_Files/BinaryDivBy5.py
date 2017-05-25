input_String=input()
binaryString=[x for x in input_String.split(',')]
length=(len(binaryString))
list=[]
for i in range(0,length):
	value=int(binaryString[i],2)
	print("Hey the value at i is",i,value)

	if(value%5==0):
		list.append(binaryString[i])


print(list)
