#using simplest approach find pow(10,5) that is 100000
def naive(a,b,res):
    z=0;
    if b!=0:
		res=res*a
		z=z+1
		b=b-1
		return naive(a,b,res)
    return res

print naive(10,5,res=1)
print naive(5,3,res=1)
