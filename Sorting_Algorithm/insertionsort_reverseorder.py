# reverse insertion sort non increasing (decreasing order)
class InsertionSort:
	def insertion_sort(self,lis):
		for j in range(1,len(lis)):
			key=lis[j]
			print "Key is:",key
			i=j-1
			while i>=0 and lis[i]<key: # corrected the pseudocode i>=0
				print "lis[i]",lis[i]
				lis[i+1]=lis[i]
				print "lis[i+1] in",lis[i+1]
				i=i-1
			lis[i+1]=key
			print "lis[i+1] out",lis[i+1]
			print lis
		return lis
		
if __name__=='__main__':
	li=[];count=0 # [6,5,4,3,2,1]
	print "Enter any 6 numbers (Insertion Sort)" 
	while count<=5:
		a=int(raw_input())
		li.append(a)
		count=count+1
	Insort=InsertionSort()
	na=Insort.insertion_sort(li)
	print "The sorted list is: ",na
