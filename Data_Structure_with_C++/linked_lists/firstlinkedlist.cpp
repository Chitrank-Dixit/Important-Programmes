/* Program to simple create an element in the list and display the list */
#include <iostream>
#include <stdio.h>
using namespace std;
struct node
{
       int num;
       node *ptr;
};
typedef struct node NODE;
class lin
{
    NODE *head,*first,*temp;
    int count,choice;
    public:
        void insert();
        void output();
        lin()
        {
            count=0;
            choice=1;
            first=NULL;
        }



};
int main()
{
    lin l;
    l.insert();
    l.output();
    return 0;
}
void lin::insert()
{
    while(choice)
    {
        head=new NODE;
        cout<<"Enter the data item\n ";
        cin>>head->num;
        if(first!=NULL)
        {
            temp->ptr=head;
            temp=head;

        }
        else
        {
            first=temp=head;

        }
        cout<<"Do you want to continue(type 0 or 1) ?"<<endl;
        cin>>choice;
    }
}
void lin::output()
{
    temp->ptr=NULL;
    temp=first;
    cout<<endl<<"Status of the linked list is";
    while(temp!=NULL)
    {
        cout<<endl<<temp->num;
        count++;
        temp=temp->ptr;

    }
    cout<<endl<<"No of nodes in the list = "<<count;
}
