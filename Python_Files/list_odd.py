#Use a list comprehension to square each odd number in a list. The list is input by a sequence of comma-separated numbers.
inputString=input()
list=[x for x in inputString.split(',') if int(x)%2!=0]
print(list)