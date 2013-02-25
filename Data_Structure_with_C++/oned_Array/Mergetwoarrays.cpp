// merging two arrays
#include <iostream>
using namespace std;
class isdel
{
	int p,q,m,n,c;
	int array1[100],array2[100],array3[100];
	public:
	 void in();
	
};
int main()
{
	isdel ind;
	ind.in();
	return 0;
}
void isdel::in()
{
	cout<<"Enter the number of elements of the first sorted array "<<endl;
	cin>>p;
	cout<<"Enter elements of the first sorted array"<<endl;
	for(m=0;m<=p-1;m++)
	cin>>array1[m];
	cout<<"Enter the number of elements of the second sorted array "<<endl;
	cin>>q;
	cout<<"Enter elements of the second sorted array"<<endl;
	for(n=0;n<=q-1;n++)
	cin>>array2[n];
	c=0;
	m=0;
	n=0;
	while((m<p) && (n<q))
	{
		if(array1[m]<=array2[n])
			array3[c]=array1[m++];
		else
			array3[c]=array2[n++];
		c++;
	}
	while(m<p)
	{
		array3[c]=array1[m];
		c++;
		m++;
	}
	while(n<q)
	{
		array3[c]=array2[n];
		c++;
		n++;	
		
	}
	cout<<endl<<"Merged array in ascending order";
	for(m=0;m<=c-1;m++)
		cout<<endl<<array3[m];
		
}
	
	
	
	

