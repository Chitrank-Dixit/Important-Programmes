# implementing merge sort algorithm
# p<=q<r
def merge_list(left,right):
    result=[]
    i,j=0,0
    while i < len(left) and j < len(right):
        if left[i] <=right[j]:
            result.append(left[i])
            print "Left result",result
            i=i+1
        else:
            result.append(right[j])
            print "Right result",result
            j=j+1
    result=result+left[i:]
    result=result+right[j:]
    print "Result out",result
    return result
    



def merge_sort(lis):
    if len(lis)<2:
        return lis
    middle=len(lis) / 2
    left=merge_sort(lis[:middle])
    print "left",left
    right=merge_sort(lis[middle:])
    print "right",right
    return merge_list(left,right)
    
        



if __name__=="__main__":
    print "Enter 6 elements: "
    i=0;lis=[];merge_lis=[]
    while i<=5:
        x=int(raw_input())
        lis.append(x)
        i=i+1
    merge_lis=merge_sort(lis)
    print "Sorted list is: ",merge_lis
    
    
        
