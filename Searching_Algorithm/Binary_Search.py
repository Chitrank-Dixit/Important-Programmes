to_find=[12,23,54,56,67,78,95,99]
count=0
key=67
b=0
e=len(to_find)-1
while b<=e:
    m=(b+e)/2
    count=count+1
    if to_find[m] < key:
        b=m+1
    else:
        e=m-1
        
if b== len(to_find) or to_find[b]!=key:
    print "Index of the element not found: Element not in the list",-1
else:
    print "Index of the element",to_find[b],"in the list is:",b

print count # this means log base 2 of count = no of elements of the list
