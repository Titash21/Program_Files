input_String=input()
allWords=[x for x in input_String.split(" ")]
length=(len(allWords))
print("The number of words entered is ",length)
uniqueWords=set()
for item in allWords:
	if item not in uniqueWords:
		uniqueWords.add(item)

print(sorted(uniqueWords))