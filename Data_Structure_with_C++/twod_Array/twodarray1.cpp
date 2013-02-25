//Operations Two dimensional Arrays
#include <iostream>
using namespace std;
int main()
{
	int a[3][3],i,j;
	cout<<"Enter the array elements: "<<endl;
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			cin>>a[i][j];
		}
	}
	cout<<"The elements of the array are "<<endl;
	for(i=0;i<=2;i++)
	{
		for(j=0;j<=2;j++)
		{
			cout<<"\t"<<a[i][j];
		}
		cout<<endl;
	}
	return 0;
}
 
