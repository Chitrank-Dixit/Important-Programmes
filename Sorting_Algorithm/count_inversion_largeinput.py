# counting the number of inversions in integer array
#output 2407905288
def count_inv(li):
	count=0
	for i in range(0,len(li)):
		for j in range(1,len(li)):
			if li[i]>li[j] and i<j:
				count=count+1
	return count
	
	
if __name__=="__main__":
	f=open('IntegerArray.txt','r')
	i=0;to_inv=[]
	line=f.readline()
	while line != '':
		to_inv.append(int(line))
		line=f.readline()
	count=0
	for a in to_inv:
		count=count+1
		print type(a),count
		
	print count_inv(to_inv)
		
	
	
	
