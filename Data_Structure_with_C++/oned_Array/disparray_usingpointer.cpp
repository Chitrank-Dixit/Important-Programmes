// display array elements using pointers
#include <iostream>
using namespace std;
int main()
{
	int *ptr1, i , a[]={10,20,30,40,50,60};
	i=0;
	ptr1=&a[0];
	while(i<=5)
	{
		cout<<"ADDRESS= "<<ptr1;
		cout<<"\t"<<"ELEMENT= "<<*ptr1<<endl;
		i++;
		ptr1++;
	
	
	}
	return 0;
}
