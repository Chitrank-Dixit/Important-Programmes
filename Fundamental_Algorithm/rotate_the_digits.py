# Program to Rotating the digits one place to the right
x=int(raw_input("Enter a no: "))
k=0;y=1;z=x;res=0;rem=0;n=0;count=0
while x!=0:
	x=x/10
	n=n+1

while k<n:
	rem=z%10
	while count<(n-1):
		y=y*10
		count=count+1
	z=int(z/10)
	res=(y*rem)+z
	z=res
	k=k+1
	print res
	
	
	
