/*Doubly Linked lists insertion,deletion and traversal*/
#include <iostream>
#include <stdio.h>
#include <conio.h>
using namespace std;
struct node
{
    int info;
    node *prev;
    node *next;
};
node *head,*tail;
class list
{
    public:

        void createemptylist(node *);
        void traverseinorder(node *);
        void traversereverse(node *);
        void insertatbegin(int);
        void insertatend(int);
        void insert_spe(node *,int);
        void deletefrombeg(void);
        void deletefromend(void);




};
void list::createemptylist(node *head)
{
    head=NULL;



}
void list::traverseinorder(node *head)
{
    while(head!=(node *)NULL)
    {
        cout<<endl<<(head->info);
        head=head->next;
    }
}
void list::traversereverse(node *tail)
{
    while(tail!=(node *)NULL)
    {
        cout<<endl<<(tail->info);
        tail=tail->prev;
    }
}
void list::insertatbegin(int item)
{
    node *ptr;
    ptr=new node;
    ptr->info=item;
    if(head==NULL)
    {
        ptr->prev=ptr->next=NULL;
        head=tail=ptr;
    }
    else
    {
        ptr->prev=NULL;
        ptr->next=head;
        head->prev=ptr;
        head=ptr;
    }

}
void list::insertatend(int item)
{
    node *ptr;
    ptr=new node;
    ptr->info=item;
    if(tail==NULL)
    {
        ptr->prev=ptr->next=NULL;
        head=tail=ptr;
    }
    else
    {
        ptr->next=NULL;
        ptr->prev=tail;
        tail->next=ptr;
        tail=ptr;
    }
}
void list::insert_spe(node *head,int item)
{
    node *ptr,*loc;
    int temp,k;
    for(k=0,loc=head;k<temp;k++)
    {
        loc=loc->next;
        if(loc==NULL)
        {
            cout<<"Node in the list at less than one";
            return;

        }

    }
    ptr=new node;
    ptr->info=item;
    ptr->next=loc->next;
    loc->next=ptr;

}
void list::deletefrombeg()
{
    node *ptr;
    if (head==NULL)
    {
        cout<<"Nothing to Delete";

    }
    else if(head->next==NULL)
    {
        ptr=head;
        head=tail=NULL;
    }
    else
    {
        ptr=head;
        head=head->next;
        head->prev=NULL;
    }
    delete(ptr);
}
void list::deletefromend()
{
    node *ptr;
    if(tail==NULL)
    {
        cout<<"Nothing to delete";
    }
    else
    {
        ptr=tail;
        tail=tail->prev;
        tail->next=NULL;
    }
    delete(ptr);
}
int main()
{
    int choice,item,after;
    char ch;
    list l;
    l.createemptylist(head);
    do
    {
        cout<<endl<<"1. Insert element at beginning "<<endl;
        cout<<"2. Insert element at end position "<<endl;
        cout<<"3. Insert specific position "<<endl;
        cout<<"4. Delete at the beginnning"<<endl;
        cout<<"5. Delete from the end"<<endl;
        cout<<"6. Traverse the list in order "<<endl;
        cout<<"7. Traverse in reverse order"<<endl;
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
                    l.insert_spe(head,item);
                    break;
            case 4: l.deletefrombeg();
                    break;
            case 5: l.deletefromend();
                    break;

            case 6: cout<<"Traverse the list "<<endl;
                    l.traverseinorder(head);
                    break;
            case 7: cout<<"Traverse in reverse"<<endl;
                    l.traversereverse(tail);
                    break;
            case 8:
                    return 0;
        }
        cout<<endl<<"do you want to continue(y/n)";
        cin>>ch;


    }while((ch=='Y') || (ch=='y'));
    return 0;
}
