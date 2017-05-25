input_String=input()
array_of_details=[x for x in input_String.split(',')]
name=array_of_details[0]
mark1=int(array_of_details[1])
mark2=int(array_of_details[2])
mark3=mark1+mark2
print(name,mark3)