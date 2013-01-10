# recursive definition of reversing a number

def reverse_no(n,reverse):
	if n!=0:
		reverse=reverse * 10
		reverse=reverse + (n%10)
		n=n/10
		return reverse_no(n,reverse)
	return reverse





n=int(raw_input("Enter a number to reverse\n"))

result=reverse_no(n,0)
print ("Reverse of entered number is = ", result)
 
'''
real	0m1.076s
user	0m0.028s
sys	0m0.012s


'''
