// Another Array program in C++ to pass array to a function
#include <iostream>

using namespace std;
int funarray(int[],int);
int main()
{
	int a[5],i,sum_array;
	cout<<"Enter the array elements: ";
	for(i=0;i<=4;i++)
	{
		cin>>a[i];
	
	}
	sum_array=funarray(a,4);
	cout<<"The sum of array elements are: "<<sum_array;
	

	return 0;
}
int funarray(int p[],int q)
{
	int i,s=0;
	for(i=0;i<=q;i++)
	{
		s=s+p[i];
		
	}
	return (s);
	
}
