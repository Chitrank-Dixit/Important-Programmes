#using russian peasants approach find pow(10,5) that is 100000
def russian(a,b):
	x=a;y=1;
	z=0;count=0;
	while count<b:
		z=0
		while x>0:
			if x%2==1:
				z=z+y
			y=y<<1
			x=x>>1
		x=a
		y=z
		count=count+1
	return z

print russian(10,5)
print russian(12,2)

'''
real	0m0.033s
user	0m0.020s
sys	0m0.012s



'''
