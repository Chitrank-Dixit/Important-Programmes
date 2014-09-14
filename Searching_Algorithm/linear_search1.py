# linear search
to_find=[12,54,23,67,78,56,95,99]
key=67
i=0
while i!=len(to_find) and key!=to_find[i]:
    i=i+1
if i==len(to_find):
    print "Index of the element not found: Element not in the list" -1
else:
    print "Index of the element",to_find[i]," in the list is:",i
