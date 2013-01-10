# reverse a number 2
reverse = 0
n=int(raw_input("Enter a number to reverse\n"))
while (n != 0):
	reverse = reverse * 10
	reverse = reverse + (n%10)
	n = n/10
print ("Reverse of entered number is = ", reverse)
 
'''
real	0m1.478s
user	0m0.016s
sys	0m0.008s


'''  
