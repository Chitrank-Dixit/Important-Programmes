# count the number of digits of integer number
n=int(input("Enter a number: "))
i=0
x=0
while n!=0:
	x=(n%10)
	i=i+x
	n=n/10
	
print i


