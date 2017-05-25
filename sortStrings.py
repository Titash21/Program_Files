input_String=input()
allStrings=[x for x in input_String.split(',')]
allStrings.sort()
print (','.join(allStrings))