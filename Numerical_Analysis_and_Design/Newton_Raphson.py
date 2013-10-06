# Newton Raphson Algorithm in Python

# Programming Language: Python 2.7.3

# Differentiation
def df(x):
	dif= 2*x - 1
	return dif

# Equation = X**2 - X - 1
def f(x):
	result= x**2 - x -1  #x**2 - 8
	return result

# We are taking input a, b and E and as the input entered would come as String we are parsing the string to floating point

b= float(raw_input("Value for the Interval B: ")) # Change the values as required
E= float(raw_input("Error Tolerance: ")) # like 0.0001 or 0.003

print f(b)

m = b - f(b) / df(b)
i=1

while abs(f(m)) >= E:
	print "Interation: ",i,b,m
	b = m
	m = b - f(b) / df(b)
	i = i + 1

print "Final Interation: ",i,b,m, f(m)

