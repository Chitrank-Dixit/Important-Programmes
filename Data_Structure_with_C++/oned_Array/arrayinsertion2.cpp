// insertion in array 
// two ways 
// 1) at the end of array
// 2) at the required position of array


/* The following program uses the insertion 
 * 1) at the end of array
 * */
#include <iostream>

using namespace std;
int i,len,num;        // length , position and number to be inserted
class Insert_array
{
	public: void insert(int a[],int,int);


};
int main()
{
	int a[10],i;
	Insert_array ia; // object of the class Insert_array
	cout<<"Enter the length of an array: ";
	cin>>len;
	cout<<"Enter the array: ";
	for(i=0;i<=len-1;i++)
	{
		cin>>a[i];
	}
	cout<<"Enter the integer to be inserted: "<<endl;
	cin>>num;
	
	/* used pre decrement because of the index, if someone wants to enter an element at 1 position it actually enters at 0th position 
	*/
	 
	ia.insert(a,len,num);
	
	
	return 0;
}

void Insert_array::insert(int a[],int len,int num)
{
	for(i=len;i>=len;i--)
	{
		a[i+1]=a[i];
	}
	a[len]=num;
	
	len++;
	cout<<"New array"<<endl;
	for(i=0;i<len;i++)
	{
		cout<<a[i]<<endl;
	}
	
}
