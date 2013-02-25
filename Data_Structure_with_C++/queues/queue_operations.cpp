/* The program implementing all the operations over Queue */
#include <iostream>
#include <stdio.h>
using namespace std;
#define MAXSIZE 5
class menuqueue
{
	int front,rear;
	int q[10];
	public:
		void qinsert();
		int qdelete();
		void qdisplay();
		menuqueue()
		{
			front=-1;
			rear=-1;
		}

};
int main()
{
	int choice;
	menuqueue me;
	do
	{
		cout<<endl<<"1 Insert"<<endl;
		cout<<"2 Delete"<<endl;
		cout<<"3 Display"<<endl;
		cout<<"4 exit"<<endl;
		cout<<"Enter you choice"<<endl;
		cin>>choice;
		switch(choice)
		{
			case 1:
				me.qinsert();
				break;
			case 2:
				me.qdelete();
				break;
			case 3:
				me.qdisplay();
				break;
			case 4:
				return 0;
		
		
		}
		
	
	}
	while(choice!=4);
	return 0;
}
void menuqueue::qinsert()
{
	int num;
	if(rear==(MAXSIZE-1))
	{
		cout<<"queue is full"<<endl;
		return;
	
	}
	else
	{
		cout<<"Enter no \n";
		cin>>num;
		rear=rear+1;
		q[rear]=num;
		if(front==-1)
		{
			front++;
		}
	}
	return;


}
int menuqueue::qdelete()
{
	int num;
	if(front==-1)
	{
		cout<<"queue empty"<<endl;
		return 1;
	
	}
	else
	{
		if(front==rear)
		front=rear=-1;
		else
		{
			num=q[front];
			cout<<"deleted item = "<<q[front];
			front++;
		
		}
	
	}
	return(num);

}
void menuqueue :: qdisplay()
{
	int i;
	if(front==-1)
	{
		cout<<"queue empty\n";
		return;
	
	}
	else
	{
		cout<<endl<<"The status of the queue"<<endl;
		for(i=front;i<=rear;i++)
		{
			cout<<endl<<q[i];
		}
	
	}
	cout<<endl;


}
