#!/usr/bin/env python
import math
C=50
H=30
D=input()
result=[]
dValue=[x for x in D.split(',')]
for item in dValue:
	token=(int(item))
	result.append(str(math.sqrt((2*C*token)/H)))


print(result)

