/* Insertion and deletion on circular linked lists */
#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
using namespace std;

struct rec
{
    char name[80];
    struct rec *next;

};
struct rec *rear,*first;
class linklist
{
    public:
            struct rec *create(struct rec *);
            struct rec *insert1(struct rec *);
            struct rec *insert2(struct rec *);
            struct rec *insert3(struct rec *);
            struct rec *insert4(struct rec *);
            struct rec *delet(struct rec *);
            struct rec *display(struct rec *);
            int select();
            linklist()
            {
                first=NULL;
            }
};
int nodes;
int main()
{
    int choice;
    linklist ls;
    do
    {
        choice=ls.select();
        switch(choice)
        {
            case 1: first=ls.create(first);continue;
            case 2: first=ls.insert1(first);continue;
            case 3: first=ls.insert2(first);continue;
            case 4: first=ls.insert3(first);continue;
            case 5: first=ls.insert4(first);continue;
            case 6: first=ls.delet(first);continue;
            case 7: ls.display(first);continue;
            case 8: cout<<"END";
            exit(0);
        }
    }while(choice!=8);
    return 0;
}
int linklist::select()
{
    int selection;
    
    do
    {
        
        cout<<endl<<"Enter 1: create the list: ";
        cout<<endl<<"Enter 2: insert in the begining the list: ";
        cout<<endl<<"Enter 3: insert after a node in the list: ";
        cout<<endl<<"Enter 4: insert before a node in the list: ";
        cout<<endl<<"Enter 5: insert in the end of the list: ";
        cout<<endl<<"Enter 6: delete the list: ";
        cout<<endl<<"Enter 7: display the list: ";
        cout<<endl<<"Enter 8: END: ";
        cout<<endl<<"Enter your choice";
        cin>>selection;

        
        
    }
    while(selection<1 || selection>8);
    return selection;
}
rec *linklist::create(struct rec *first)
{
	struct rec *element;
	first=new rec;
	cout<<"Enter/name/word/text: To quit enter*"<<endl;
	cin>>first->name;
	first->next=first;
	rear=first;
	rear->next=first;
	for(; ;)
	{
		element=new rec;
		cin>>element->name;
		if(strcmp(element->name,"*")==0)break;
		element->next=first;
		rear->next=element;
		rear=element;
		
		
	}
	return(first);
	
	
	
}
rec *linklist::insert1(rec *first)
{
	struct rec *node;
	node=new rec;
	cout<<"Enter node/name to be inserted"<<endl;
	cin>>node->name;
	if(first==NULL)
	{
		node->next=first;
		rear=first;
		
	}
	else
	{
		node->next=first;
		first=node;
		rear->next=first;
		
	}
	return(first);
}
rec *linklist::insert2(rec *first)
{
	rec *current,*x;
	struct rec *node;
	current=first;
	node=new rec;
	cout<<"Enter node/name after which new node to be inserted"<<endl;
	cin>>node->name;
	x=new(struct rec);
	cout<<"Enter node/name to be inserted"<<endl;
	cin>>x->name;
	while(current!=rear && current!=NULL)
	{
		if(strcmp(current->name,node->name)==0)
		{
			x->next=current->next;
			current->next=x;
			return(first);
			
		}
		else current=current->next;
	}
	if(strcmp(current->name,node->name)==0)
	{
		x->next=first;
		rear->next=x;
		rear=x;
		return(first);
		
	}
	cout<<endl<<"Node does not exist in the list"<<endl;
	return(first);
}
rec *linklist::insert3(rec *first)
{
	struct rec *node,*current,*x,*prior;
	current=first;
	node=new rec;
	cout<<"Enter node/name before which new node to be inserted"<<endl;
	cin>>node->name;
	x=new rec;
	cout<<"Enter node/name to be inserted"<<endl;
	cin>>x->name;
	if(strcmp(current->name,node->name)==0)
	{
		x->next=first;
		first=x;
		return(first);
	}
	while(current!=NULL)
	{
		prior=current;
		current=current->next;
		if(strcmp(current->name,node->name)==0)
		{
			x->next=current;
			prior->next=x;
			return(first);
			
		}
		
	}
	cout<<endl<<"Node does not exist in the list"<<endl;
	return(first);
}
rec *linklist::insert4(struct rec *first)
{
	struct rec *element;
	element=new rec;
	cout<<"Enter node/name to be inserted at the end of the list"<<endl;
	cin>>element->name;
	element->next=first;
	rear->next=element;
	rear=element;
	return(first);
	
	
}
rec *linklist::delet(struct rec *first)
{
	struct rec *current,*prior,*node;
	current=first;
	node=new rec;
	cout<<"Enter node/name to be deleted"<<endl;
	cin>>node->name;
	if(strcmp(current->name,node->name)==0)
	{
		first=current->next;
		rear->next=first;
		delete(current);
		return(first);
		
		
	}
	while(current!=rear && current!=NULL)
	{
		prior=current;
		current=current->next;
		if(strcmp(current->name,node->name)==0)
		{
			prior->next=current->next;
			delete(current);
			return(first);
			
			
			
		}
		
	}
	if(strcmp(current->name,node->name)==0)
	{
		prior->next=current->next;
		prior->next=first;
		rear=prior;
		delete(current);
		return(first);
	}
	cout<<endl<<"Node does not exist in the list"<<endl;
	return(first);
	
	
}
rec *linklist::display(rec *first)
{
	int node=0;
	do
	{
		node++;
		cout<<endl<<first->name;
		first=first->next;
		
		
	}
	while((first!=rear->next)&&(first!=NULL));
	cout<<endl<<"Number of nodes = "<<node;
	return first;
}
