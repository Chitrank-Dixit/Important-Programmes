/* queue implementation using pointers */
#include <iostream>
#include <stdio.h>
//#include <alloc.h>
#include <stdlib.h>
using namespace std;
#define MAXSIZE 5
struct queue
{
	int no;
	struct queue *next;
};
class que
{
	queue *start;
	public:
		void add();
		int del();
		void traverse();
		que()
		{
			start=NULL;
		}

};
int main()
{
	int ch,value;
	char choice;
	que q;
	do
	{
		cout<<endl<<"1 Insert"<<endl;
		cout<<"2 Delete"<<endl;
		cout<<"3 Display"<<endl;
		cout<<"4 exit"<<endl;
		cout<<"Enter you choice"<<endl;
		cin>>ch;
		switch(ch)
		{
			case 1:
				q.add();
				break;
			case 2:
				value=q.del();
				cout<<"The deleted element is "<<value;
				break;
			case 3:
				q.traverse();
				break;
			case 4:
				return 0;
			default:
				cout<<endl<<"wrong choice";
		
		
		}
		
	
	}
	while(choice!=4);
	cin>>choice;
	return 0;
}
void que::add()
{
	struct queue *p,*temp;
	temp=start;
	p=new(struct queue);
	cout<<"Enter the data";
	cin>>p->no;
	p->next=NULL;
	if(start==NULL)
	{
		start=p;
	}
	else
	{
		while(temp->next!=NULL)
		{
			temp=temp->next;
		}
		temp->next=p;
	}
	
}
int que::del()
{
	struct queue *temp;
	int value;
	if(start==NULL)
	{
		cout<<endl<<"queue is empty";
		return(0);
	}
	else
	{
		temp=start;
		value=temp->no;
		start=start->next;
		delete(temp);
	}
	return(value);
}
void que :: traverse()
{
	struct queue *temp;
	temp=start;
	while(temp->next!=NULL)
	{
		cout<<endl<<"no= "<<temp->no;
		temp=temp->next;
		
		
	}
	cout<<endl<<"no= "<<temp->no;


}
