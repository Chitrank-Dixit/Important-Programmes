# Counting number of Inversions
def count(li):
	count=0
	for i in range(0,len(li)):
		for j in range(1,len(li)):
			if li[i]>li[j] and i<j:
				count=count+1
	return count
				
		
	







if __name__=="__main__":
	to_in=[1,3,5,2,4,6]
	inv=[]
	inv=count(to_in)
	print "Number of Inversions are: ",inv
	
