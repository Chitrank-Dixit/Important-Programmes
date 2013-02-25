// display the contents of two dimensional array using pointers
#include <iostream>
using namespace std;
int main()
{
	static int a[3][2]={{100,200},{300,400},{500,600}}	;
	int *ptr,i,j,n,m;
	ptr=&a[0][0];
	n=3;
	m=2;
	for(i=0;i<n;i++)
	{
			cout<<endl;
			for(j=0;j<m;j++)
			{
				
				cout<<"\t"<<*ptr;
				ptr++;
			}
			
	}
	return 0;
}
