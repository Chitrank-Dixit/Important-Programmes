# program to reverse the number of digits
import math
x=int(raw_input("Enter any number: "))
z=x;r=0;l=0;n=0
while (x != 0):
	n=n+1
	x=int(x/10)
	
i=n
mul=1
while (i > 0):
	k=z % 10
	l=k*math.pow(10,(n-mul))
	print l
	z=int(z/10)
	r=r+l
	i=i-1
	mul=mul+1

print "Reverse of Number is",int(r)

'''
real	0m1.849s
user	0m0.016s
sys	0m0.012s


'''
