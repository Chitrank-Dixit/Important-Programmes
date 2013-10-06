# Bisection Method Algorithm in Python

# Programming Language: Python 2.7.3
# Other Dependencies: None


# Equation = X**2 - X - 1
def f(x):
	result= x**2 - x -1  #x**2 - 8
	return result


# We are taking input a, b and E and as the input entered would come as String we are parsing the string to floating point
a= float(raw_input("Value for the Interval A: ")) # Change the values as required
b= float(raw_input("Value for the Interval B: ")) # Change the values as required
E= float(raw_input("Error Tolerance: ")) # like 0.0001 or 0.003

print f(a), f(b)

if (f(a)*f(b)) < 0:
	m=(a+b) / 2
	i=1
	while abs(f(m)) >= E:
		print i,a,b,m,f(m)
		if (f(a)*f(m)) > 0:
			a=m
		else:
			b=m
		m=(a+b)/2
		i=i+1
	print i,a,b,m,f(m)
else:
	print 'interval not suitable'
