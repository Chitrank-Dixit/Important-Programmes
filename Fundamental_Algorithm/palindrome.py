# http://en.wikipedia.org/wiki/Palindromic_number
# A palindromic number or numeral palindrome is a number that remains the same
# when its digits are reversed. Like 16461, for example, it is "symmetrical".
def palindrome(x):
    reverse=0
    while (x != 0):
        reverse = reverse * 10
        reverse = reverse + (x%10)
        x = x/10
    return reverse
        
        






if __name__=="__main__":
    x=int(raw_input("Enter a number: "))
    z=x
    y=palindrome(x)
    if y==z:
        print "The following number is palindrome"
    else:
        print "The following number is  not palindrome"
        
