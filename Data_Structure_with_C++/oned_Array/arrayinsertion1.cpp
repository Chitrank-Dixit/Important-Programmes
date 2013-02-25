// insertion in array 
// two ways 
// 1) at the end of array
// 2) at the required position of array


/* The following program uses the insertion 
 * 2) at the required position of the array
 * */
#include <iostream>

using namespace std;
int i,len,pos,num;        // length , position and number to be inserted
class Insert_array
{
	public: void insert(int a[],int,int,int);


};
int main()
{
	int a[100],i;
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
	cout<<"Enter the position in the array for insertion: "<<endl;
	cin>>pos;
	--pos;  
	/* used pre decrement because of the index, if someone wants to enter an element at 1 position it actually enters at 0th position 
	*/
	 
	ia.insert(a,len,pos,num);
	
	
	return 0;
}

void Insert_array::insert(int a[],int len,int pos,int num)
{
	for(i=len;i>=pos;i--)
	{
		a[i+1]=a[i];
	}
	a[pos]=num;
	if(pos>len)
	{
		cout<<"Insertion outside the array ";
			
	}
	len++;
	cout<<"New array"<<endl;
	for(i=0;i<len;i++)
	{
		cout<<a[i]<<endl;
	}
	
}
