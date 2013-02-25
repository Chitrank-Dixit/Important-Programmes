/* implementation of Priority Queue */
#include <iostream>
#include <stdio.h>
#include <stdlib.h>
using namespace std;
#define TRUE 1
#define FALSE 0
struct node 
{
	int info;
	struct node *next;
};
typedef struct node *nodeptr;
typedef struct
{
	nodeptr front;
}
priq;
priq q;
class pri_queue
{
	public:
		int empty(priq *);
		int rem(priq *);
		void insert(priq *,int);
		int qfront(priq *);
		void qsee(priq *);
};
int pri_queue::empty(priq *pq)
{
	return((pq->front==NULL)? TRUE:FALSE);
	
}
int pri_queue::rem(priq *pq)
{
	nodeptr p;
	int x;
	if(empty(pq))
	{
		cout<<endl<<"Priority Queue underflow !";
		exit(1);
	}
	p=pq->front;
	x=p->info;
	pq->front=p->next;
	delete(p);
	return(x);
}
void pri_queue::insert(priq *pq,int x)
{
	nodeptr p,q,n;
	n=new(struct node);
	n->info=x;
	q=NULL;
	for(p=pq->front;p!=NULL && x>p->info ; p=p->next)
	q=p;
	if(q==NULL)
	{
		n->next=pq->front;
		pq->front=n;
		
	}
	else
	{
		n->next=q->next;
		q->next=n;
		
	}
	return;
	
}
int pri_queue::qfront(priq *pq)
{
	if(empty(pq))
	{
		cout<<endl<<"EMPTY QUEUE !";
		exit(1);
		
	}
	return((pq->front)->info);
	
}
void pri_queue::qsee(priq *pq)
{
	nodeptr p=pq->front;
	if(empty(pq))
	{
		cout<<endl<<"EMPTY PRIORITY QUEUE !";
		exit(1);
		
	}
	cout<<endl<<"QUEUE:- ";
	while(p!=NULL)
	{
		cout<<" "<<p->info;
		p=p->next;
		
	}
	return;
}
int main()
{
	int n,op;
	pri_queue pq;
	q.front=NULL;
	while(TRUE)
	{
		cout<<endl<<"\t"<<"******MAIN MENU******";
		cout<<endl<<"1.INSERT 2.REMOVE 3.SEE FRONT ELEMENT 4.SEE FULL QUEUE 5.EXIT";
		cout<<"Enter you choice"<<endl;
		cin>>op;
		switch(op)
		{
			case 1:
				cout<<endl<<"Enter the element: ";
				cin>>n;
				pq.insert(&q,n);
				break;
			case 2:
				cout<<endl<<"Element Removed= "<<pq.rem(&q);
				break;
			case 3:
				cout<<endl<<"Front Element = "<<pq.qfront(&q);
				break;
			case 4:
				pq.qsee(&q);
				break;
			case 5:
				exit(0);
			default:
				cout<<endl<<"Invalid Operation";
		
		
		}
		
	
	}
	
	return 0;
}

