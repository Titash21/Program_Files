#Write a program that computes the value of a+aa+aaa+aaaa with a given digit as the value of a.
inputDigit=int(input())

n1 = int( "%s" % inputDigit )
n2 = int( "%s%s" % (inputDigit,inputDigit) )
n3 = int( "%s%s%s" % (inputDigit,inputDigit,inputDigit) )
n4 = int( "%s%s%s%s" % (inputDigit,inputDigit,inputDigit,inputDigit) )
print(n1+n2+n3+n4)
