# implemeting bubble sort in Python
def bubble_sort(sort):
	temp=0
	for i in range(0,len(sort)):
		for j in range(len(sort)-1,i,-1):    # here I have used reverse range range(para1,para2,para3) 
			print sort[j],sort[j-1]
			if sort[j] < sort[j-1]:
				temp=sort[j]
				sort[j]=sort[j-1]
				sort[j-1]=temp
	return sort

if __name__=="__main__":
	print "Enter the element: "
	to_sort=[]
	for i in range(0,6):
		x=int(raw_input())
		to_sort.append(x)
	sorted_list=bubble_sort(to_sort)
	print "Sorted list is: ",sorted_list
		
	
