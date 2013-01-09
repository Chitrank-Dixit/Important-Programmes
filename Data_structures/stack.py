# stack operations in Python Programming

class stackimp:
    def __init__(self):
        self.item=[]
       
    def push(self,element):
        self.item.append(element)

    def pop(self):
        return "item deleted",self.item.pop()
        
    def traverse(self):
        l=len(self.item)
        i=l-1
        while i>=0:
			print self.item[i]
			i=i-1
		

if __name__=='__main__':
	s=stackimp()
	s.push(12)
	s.push(2)
	s.push(212)
	s.push(125)
	print "Item deleted is: ",s.pop()
	print "Items in the Stack /n",s.traverse()

        
