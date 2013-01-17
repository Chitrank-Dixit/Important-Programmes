def selection_sort(a):
	i=0;j=1;temp=0
	while i<len(a) and j<len(a):
		if a[i] > a[j]:
			temp=a[j]
			a[j]=a[i]
			a[i]=temp
		j=j+1
		i=i+1
	return a



if __name__=="__main__":
	a=[5,3,7,4,2]
	for i in range(0,len(a)):
		sorted_list=selection_sort(a)
	print "The sorted list is: ",sorted_list
	
