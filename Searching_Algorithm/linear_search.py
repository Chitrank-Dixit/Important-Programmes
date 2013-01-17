# linear search algorithm
class LinearSearch:
	def linear_search(self,lis,find):
		found=0;count=0
		for a in lis:
			if a==find:
				found=a
			else:
				found=None
			count=count+1
		index=count-1
		return found,index
		
if __name__=='__main__':
	li=[];count=0 # [6,5,4,3,2,1]
	print "Enter any 6 numbers (Insertion Sort)" 
	while count<=5:
		a=int(raw_input())
		li.append(a)
		count=count+1
	to_search=int(raw_input("Enter an element to be searched: "))
	Linsearch=LinearSearch()
	na,index=Linsearch.linear_search(li,to_search)
	print "The element found is list is: ",na,"at index",index
