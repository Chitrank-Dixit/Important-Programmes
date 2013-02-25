/* implementing Stack using pointers */
#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>
using namespace std;
struct stac
{
	int no;
	struct stac *next;
}
*start=NULL;
typedef struct stac st;
class stack
{
	
	public:
		void push();
		int pop();
		void display();
		
};
void stack::push()
{
	st *node;
	node=new(st);
	cout<<endl<<"Enter the number to be insert";
	cin>>node->no;
	node->next=start;
	start=node;


}
int stack::pop()
{
	st *temp;
	temp=start;
	if(start==NULL)
	{
		cout<<"stack is already empty";
		exit(0);
	}
	else
	{
		start=start->next;
		delete(temp);
		
	}
	return(temp->no);
}
void stack::display()
{
	st *temp;
	temp=start;
	while(temp->next!=NULL)
	{
		cout<<endl<<"no="<<(temp->no);
		temp=temp->next;
	}
	cout<<endl<<"no="<<(temp->no);
}
int main()
{
	int choice,item;
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
				item=s.pop();
				cout<<endl<<"The deleted element is"<<item;
				break;
			case 3:
				s.display();
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
