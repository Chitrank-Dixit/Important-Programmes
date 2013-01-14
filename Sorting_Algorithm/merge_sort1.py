# implementing merge sort algorithm
# p<=q<r
# In the following list both the left anf right subarray should be sorted
def merge_list(lis,p,q,r):
    n1=q-p+1
    n2=r-q
    L=[];R=[]
    print p,q,r,n1,n2
    '''

    Wrong insertion of Elements
    for i in range(0,n1+2):
        L.append(lis[i])
    for j in range(0,n2+2):
        R.append(lis[j])
    '''
    i=0;j=0
    for i in range(1,n1):
        L.insert(i,lis[p+i-1])
    for j in range(0,n2):
        R.insert(j,lis[q+j])
    print L
    print R
    #L[n1+1]=float('inf')
    #R[n2+1]=float('inf')
    i=0;j=0
    for k in range(p,r-1):
        if L[i] <= R[j]:
            lis[k]=L[i]
            print lis[k]
            i=i+1
        else:
            lis[k]=R[j]
            print lis[k]
            j=j+1
    return lis
    



def merge_sort(lis):
    if len(lis)<2:
        return lis
    q=len(lis) / 2
    p=0
    r=len(lis)
    return lis,p,q,r
        



if __name__=="__main__":
    #print "Enter 16 elements: "
    i=0;lis=[];merge_lis=[]
    '''
    while i<=15:
        x=int(raw_input())
        lis.append(x)
        i=i+1
    '''
    #lis=[17,12,56,34,67,98,78,23,43,21,54,90,85,63,49,91]
    lis=[2,4,5,7,1,2,3,6]
    lis,p,q,r=merge_sort(lis)
    merge_lis=merge_list(lis,p,q,r)
    print "The sorted list is: ",merge_lis
    
    
        
