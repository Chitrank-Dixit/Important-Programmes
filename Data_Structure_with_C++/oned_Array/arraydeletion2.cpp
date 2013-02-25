// some array based programs
// deletion of array from the end
#include <iostream>

using namespace std;
int i,len,item;        // length , position and item for later assignment
class Delete_array
{
	public: void delete_array(int a[],int);


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
	cout<<"Deleting the element at the last position in the array: "<<endl;
	
	da.delete_array(a,len);
    
	
	return 0;
}

void Delete_array::delete_array(int a[],int len)
{
	
	item=a[len];
	for(i=len;i<=len-1;i++)
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
