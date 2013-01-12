#using simplest approach find pow(10,5) that is 100000
def naive(a,b):
    x=a;y=b
    z=0;res=1
    while z<y:
        res=res*x
        z=z+1
    return res

print naive(10,5)
print naive(5,3)
