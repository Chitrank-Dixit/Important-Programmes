// some array based programs
// deletion of array from any position
#include <iostream>

using namespace std;
int i,len,pos,item;        // length , position and item for later assignment
class Delete_array
{
	public: void delete_array(int a[],int,int);


};
int main()
{
	int a[100];
	Delete_array da; // object of the class Insert_array
	cout<<"Enter the length of an array: ";
	cin>>len;
	cout<<"Enter the array: ";
	for(i=0;i<=len-1;i++)
	{
		cin>>a[i];
	}
	cout<<"Enter the position in the array for insertion: "<<endl;
	cin>>pos;
	--pos;  
	/* used pre decrement because of the index, if someone wants to enter an element at 1 position it actually enters at 0th position 
	*/
	 
	da.delete_array(a,len,pos);
	
	
	return 0;
}

void Delete_array::delete_array(int a[],int len,int pos)
{
	
	item=a[pos];
	for(i=pos;i<=len-1;i++)
	{
		a[i]=a[i+1];
	}
	len=len-1;
	
	cout<<"New array"<<endl;
	for(i=0;i<len;i++)
	{
		cout<<a[i]<<endl;
	}
	
}
