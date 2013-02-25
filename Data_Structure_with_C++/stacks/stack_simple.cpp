/* implementing Stack */
#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#define MAXSIZE 10
using namespace std;
class stack
{
	int st[MAXSIZE];
	int Top;
	public:
		void push();
		int pop();
		void traverse();
		stack()
		{
			Top=-1;
		}
		

};
void stack::push()
{
	int item;
	if(Top==MAXSIZE-1)
	{
		cout<<endl<<"The Stack is Full";
		exit(0);
	}
	else
	{
		cout<<"Enter the element to be inserted";
		cin>>item;
		Top=Top+1;
		st[Top]=item;
		
	
	
	}


}
int stack::pop()
{
	int item;
	if(Top==-1)
	{
		cout<<"The stack is empty";
		exit(0);
	
	}
	else
	{
		item=st[Top];
		Top=Top-1;
		
	}
	return(item);
}
void stack::traverse()
{
	int i;
	if(Top==-1)
	{
		cout<<"The Stack is Empty";
		exit(0);
		
	}
	else
	{
		cout<<"Traverse the element";
		for(i=Top;i>=0;i--)
		{
			cout<<endl<<st[i];
		}
	}

}
int main()
{
	int choice;
	char ch;
	stack s;
	do
	{
		cout<<"1. PUSH"<<endl;
		cout<<"2. POP"<<endl;
		cout<<"3. Traverse"<<endl;
		cout<<"Enter your choice"<<endl;
		cin>>choice;
		switch(choice)
		{
			case 1: 
				s.push();
				break;
			case 2:
				cout<<endl<<"The deleted element is"<<s.pop();
				break;
			case 3:
				s.traverse();
				break;
			default:
				cout<<endl<<"You entered Wrong Choice";
		
		
		}
		cout<<endl<<"Do you wish to continue(Y/N)";
		fflush(stdin);
		cin>>ch;
	
	}while(ch=='Y' || ch=='N');
	return 0;
}





