// some array based programs
#include <iostream>

using namespace std;


int main()
{
	int a[10],i;
	cout<<"Enter the array: ";
	for(i=0;i<=9;i++)
	{
		cin>>a[i];
	}
	cout<<"The entered array is";
	for(i=0;i<=9;i++)
	{
		cout<<a[i]<<endl;
	}
	return 0;
}
