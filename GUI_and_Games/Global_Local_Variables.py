# this is a Global Variable
num1=12


def fun():
    global num1 # accessing Global Variable
    num1=23
    num2=11 # local variable
    
    
def fun1():
    global num1 # accessing Global Variable
    num1=24
    num2=12 # local variable
print num1
fun()
print num1
fun1()
print num1
    