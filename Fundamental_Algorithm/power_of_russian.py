#using russian peasants approach find pow(10,5) that is 100000
def russian(a,b):
	x=a;y=1;power=1
	z=0;count=0;med=1
	while count<b:
		while x>0:
			if x%2==1:
				z=z+y
			y=y<<1
			x=x>>1
		z=a
		power=power*z
		y=med
		count=count+1
	return power

print russian(10,5)
print russian(12,2)
