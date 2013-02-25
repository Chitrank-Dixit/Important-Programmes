/* Inserting and Travesing the element of the list */
#include <iostream>
#include <stdio.h>

using namespace std;
struct node
{
    int info;
    node *next;
};
node *start;
class list
{
    public:
        void createemptylist(node *);
        void traverseinorder(node *);
        void insertatbegin(int);
        void insertatend(int);
        void insert_spe(node *,int);
        void delete_beg(void);
        void delete_end(node *);
        void delete_spe(node *);
        
        


};
void list::createemptylist(node *start)
{
    start=NULL;

}
void list::traverseinorder(node *start)
{
    while(start!=(node *)NULL)
    {
        cout<<endl<<(start->info);
        start=start->next;
    }
}
void list::insertatbegin(int item)
{
    node *ptr;
    ptr=new node;
    ptr->info=item;
    if(start==(node *)NULL)
        ptr->next=(node *)NULL;
    else
        ptr->next=start;
    start=ptr;

}
void list::insertatend(int item)
{
    node *ptr,*loc;
    ptr=new node;
    ptr->info=item;
    ptr->next=(node *)NULL;
    if(start==(node *)NULL)
        start=ptr;
    else
    {
        loc=start;
        while(loc->next!=NULL)
        loc=loc->next;
        loc->next=ptr;
    }
}
void list::insert_spe(node *start,int item)
{
    node *ptr,*loc;
    int temp=0,k;
    for(k=0,loc=start;k<temp;k++)
    {
        loc=loc->next;
        if(loc==NULL)
        {
            cout<<"Node in the list at less than one";
            

        }

    }
    ptr=new node;
    ptr->info=item;
    ptr->next=loc->next;
    loc->next=ptr;

}
void list::delete_beg()
{
	node *ptr;
	if(start==NULL)
		cout<<"The list is empty";
	else
	{
		ptr=start;
		start=(start)->next;
		delete(ptr);
	}
}
void list::delete_end(node *start)
{
	node *ptr,*loc;
	if(start==NULL)
		cout<<"The list is empty";
	else if((start)->next == NULL)
	{
		ptr=start;
		start=NULL;
		delete(ptr);
	}
	else
	{
		loc=start;
		ptr=(start)->next;
		while(ptr->next!=NULL)
		{
			loc=ptr;
			ptr=ptr->next;
			
		}
		loc->next=NULL;
		delete(ptr);
	}
}
void list::delete_spe(node *start)
{
	node *ptr,*loc;
	int temp=0;
	cout<<endl<<"Enter the element you want to delete: ";
	cin>>temp;
	ptr=start;
	if(start==NULL)
	{
		cout<<"Empty list";
		
	}
	else
	{
		loc=ptr;
		while(ptr!=NULL)
		{
			if(ptr->info==temp)
			{
				loc->next=ptr->next;
				delete(ptr);
				
			}
			loc=ptr;
			ptr=ptr->next;
		}
	}
}
int main()
{
    int choice,item;
    char ch;
    list l;
    l.createemptylist(start);
    do
    {
        cout<<endl<<"1. Insert element at beginning "<<endl;
        cout<<"2. Insert element at end position "<<endl;
        cout<<"3. Insert specific position "<<endl;
        cout<<"4. Delete element at beginning "<<endl;
        cout<<"5. Delete element at end "<<endl;
        cout<<"6. Delete at specific position "<<endl;
        cout<<"7. Traverse the list in order "<<endl;
        cout<<"8. exit "<<endl;
        cout<<"Enter you choice ";
        cin>>choice;
        switch(choice)
        {
            case 1: cout<<"Enter the item "<<endl;
                    cin>>item;
                    l.insertatbegin(item);
                    break;
            case 2: cout<<"Enter the item "<<endl;
                    cin>>item;
                    l.insertatend(item);
                    break;
            case 3: cout<<"Enter the item "<<endl;
                    cin>>item;
                    l.insert_spe(start,item);
                    break;
            case 4: l.delete_beg();
                    break;
            case 5: l.delete_end(start);
                    break;
            case 6: cout<<"Enter the item "<<endl;
                    cin>>item;
                    l.delete_spe(start);
                    break;
            case 7: cout<<"Traverse the list "<<endl;
                    l.traverseinorder(start);
                    break;
            case 8:
                    return 0;
        }
        cout<<endl<<"do you want to continue(y/n)";
        cin>>ch;


    }while((ch=='Y') || (ch=='y'));
    return 0;
}
