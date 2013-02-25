// travesing the array

#include <iostream>

using namespace std;
int n,x,i,a[100]; 
class trav
{
	
	public: void traverse();
};

int main()
{
	
	trav t;
	t.traverse();
	return 0;
}
void trav::traverse()
{	
	cout<<"Enter the length of the array: ";
	cin>>n;
	cout<<"Enter the array: ";
	for(i=0;i<=n-1;i++)
	{
		cin>>a[i];
	}
	cout<<"Traversing the array: ";
	for(i=0;i<=n-1;i++)
	{
		cout<<a[i]<<endl;
	}
	
}
