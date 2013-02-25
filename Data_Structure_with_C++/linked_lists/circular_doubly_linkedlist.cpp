/*circular doubly linked list*/
# include <iostream>
# include <stdlib.h>

# include <malloc.h>
using namespace std;

int cur_link_list=1;
int display_menu();
struct link_list
{
 int no;
 struct link_list *next;
};

class link
{
 link_list *list;
 public:
       link_list *head;
       link()
       {
			list=NULL;
			head=NULL;
       }
       void get_list();
       void display_list();
       void insert();
       void delete_list();
       void sort();
       void merge(link_list *,link_list*);
       friend void union_list(link_list *,link_list *);
       friend void intersact(link_list *,link_list *);
       void reverse();
};

void link :: get_list()
{
  int no;
  if(head!=NULL)
  {
  while(list->next!=head)
  {
   delete(list);
   list=list->next;
  }
  list=NULL;
  head=NULL;
  }
  while(1)
  {
    cout<<"Enter Number :";
    cin>>no;
    if(no!=0)
    {
      if(list==NULL)
      {
       list=new link_list;





       head=list;
      }
      list->no=no;
      list->next = new link_list;
      list=list->next;
    }
    else
    {
     list->next=head;
     break;
    }
  }
}

void link :: display_list()
{
 list=head;
 cout<<endl;
 if (list==NULL)
 {
  cout<<"Link list is empty !!!";
  return;
 }
 if(list->next==head)
 {
  cout<<list->no;
  return;
 }
 while(list->next!=head)
 {
   cout<<list->no<<"\t";
   list=list->next;
 }
}

void link :: insert()
{
  int ch;
  list=head;
  cout<<endl;
  cout<<"[ 1 ] : Insert at First"<<endl;
  cout<<"[ 2 ] : Insert in Middle"<<endl;
  cout<<"[ 3 ] : Insert at Last"<<endl;
  cout<<"[ 4 ] : Back to main Menu"<<endl;
  cout<<"Enter your choice :";
  cin>>ch;
  link_list *newnode;
  newnode=new link_list;
  switch(ch)
  {
   case 1:
       cout<<"Enter Number :";
       cin>>newnode->no;
       list=head;
       newnode->next=list;
        while(list->next!=head)
        {
         list=list->next;
        }
        list->next=newnode;
        head=newnode;
       break;
   case 2: int no;
       cout<<endl;
       cout<<"Enter Number after which you want to insert :";





       cin>>no;
       list=head;
       while(list->next !=head)
       {
         if(list->no==no)
         {
           cout<<"Enter Number to Insert :";
           cin>>newnode->no;
           if(list==head)
           {
           list=head;
           newnode->next=list;
           while(list->next!=head)
           {
          list=list->next;
           }
           list->next=newnode;
           head=newnode;
           }
           else
           {
        newnode->next=list->next;
        list->next=newnode;
           }
           return;
         }
         list=list->next;
       }
       cout<<"Key not found ..."<<endl;
       break;
   case 3 : list=head;
        while(list->next!=head)
        {
         list=list->next;
        }
        cout<<"Enter Number :";
        cin>>newnode->no;
        list->next=newnode;
        newnode->next=head;
        break;
  }
}

void link :: delete_list()
{
 cout<<endl;
 list=head;
 int no;
 cout<<"Enter the number to deleted :";
 cin>>no;
  if(head->no==no)
   {
    while(list->next!=head)
    {
     list=list->next;
    }
    list->next=head->next;
    head=head->next;
    return;
   }

 while(list->next!=head)
 {
   if(list->next->no==no)
   {





     list->next=list->next->next;
     return;
   }
   list=list->next;
 }
 cout<<"Number not not found !!!";
}

void link :: sort()
{
 link_list *i,*j,*t;
 for(i=head;i->next!=head;i=i->next)
 {
  for(j=head;j->next!=head;j=j->next)
  {
   if(i->no < j->no)
   {
     t->no=i->no;
     i->no=j->no;
     j->no=t->no;
   }
  }
 }
}

void union_list(link_list *l1,link_list *l2)
{
  cout<<endl;
  link_list *head1,*head2;
  head1=l1;
  head2=l2;
  link_list *h;
  h=l1;

  while(l1->next!=head1)
  {
    cout<<l1->no<<"\t";
    l1=l1->next;
  }
 int flag=0;
  while(l2->next!=head2)
  {
     l1=h;
     flag=0;
     while(l1->next!=head1)
     {
      if(l1->no==l2->no)
      {
       flag=1;
       break;
      }
      l1=l1->next;
     }
     if(flag==0)
     {
       cout<<l2->no<<"\t";
     }
     l2=l2->next;
  }
}

void intersact (link_list *l1,link_list *l2)
{
 link_list *head1;
 head1=l1;





 link_list *h;
 h=l2;
 while(l1->next!=head1)
 {
   l2=h;
   while(l2->next!=h)
   {
     if(l1->no==l2->no)
     {
      cout<<l1->no<<"\t";
      break;
     }
     l2=l2->next;
   }
   l1=l1->next;
 }
}

void link :: reverse()
{
 int a[50];
 list=head;
 int i=0;
 while(list->next!=head)
 {
  a[i]=list->no;
  list=list->next;
  i=i+1;
 }
 int n=i-1;
 i=n;
 list=head;
 while(list->next!=head)
 {
  list->no=a[i];
  list=list->next;
  i=i-1;
 }
}

void link :: merge(link_list *l1,link_list *l2)
{
 link_list *head1,*head2;
 head1=l1;
 head2=l2;
 head=NULL;
 list=new link_list;
 while(l1->next !=head1)
 {
   if(head==NULL)
   {
    head=list;
   }
   list->no=l1->no;
   list->next=new link_list;
   list=list->next;
   l1=l1->next;
   list->next=head;
 }
 while(l2->next !=head2)
 {
  list->no=l2->no;
  list->next=new link_list;
  list=list->next;
  l2=l2->next;





  list->next=head;
 }
 list->next=head;
}
int main()
{
 
 while(1)
 {
  switch(display_menu())
  {
      link l1;
		link l2;
		link l3;
      
      case 1:
		cout<<"Enter LinkList Number [ 1 , 2 , 3 ]:";
          int n;
          cin>>n;
          if(n>=1 && n<=3)
          {
           cur_link_list=n;
          }
          break;
      case 2: switch(cur_link_list)
          {
           case 1: l1.get_list();
               break;
           case 2: l2.get_list();
               break;
           case 3: l3.get_list();
               break;
          }
          
          break;

      case 3: switch(cur_link_list)
          {
        case 1 : l1.display_list();
             l1.insert();
             break;
        case 2 : l2.display_list();
             l2.insert();
             break;
        case 3 : l3.display_list();
             l3.insert();
             break;
          }
          
          break;
      case 4: switch(cur_link_list)
          {
        case 1: l1.display_list();
            break;
        case 2: l2.display_list();
            break;
        case 3: l3.display_list();
            break;
          }
          
          break;
      case 5:
          switch(cur_link_list)
          {
           case 1: l1.display_list();
               l1.delete_list();
               break;

           case 2: l2.display_list();
               l2.delete_list();
               break;

           case 3: l3.display_list();
               l3.delete_list();
               break;
          }
          
          break;
      case 6: cout<<endl;
          switch(cur_link_list)
          {
        case 1: l1.sort();
            l1.display_list();
            break;
        case 2: l2.sort();
            l2.display_list();
            break;
        case 3: l3.sort();
            l3.display_list();
            break;
          }
          cout<<endl<<endl<<"Linklist sorted !!!";
          
          break;

      case 7: cout<<endl<<endl<<"Union of First two List..."<<endl;
          union_list(l1.head,l2.head);
          
          break;
      case 8:cout<<endl<<endl<<"Intersaction of First two list..."<<endl;
         intersact(l1.head,l2.head);
         
         break;
      case 9: switch(cur_link_list)
          {
           case 1: l1.reverse();
               break;
           case 2: l2.reverse();
               break;
           case 3: l3.reverse();
               break;
          }
          
          break;
      case 10 : 
		l3.merge(l1.head,l2.head);
        cout<<endl;
        cout<<"First two linklist merged in third link list !!!";
        l3.display_list();
        
        break;
      case 11 : exit(1);
	
  }
 }
	return 0;
}

int display_menu()
{
 
 cout<<endl;
 cout<<" [ 01 ] Select Linklist (Selected List is:"<<cur_link_list<<")"<<endl;
 cout<<" [ 02 ] Get Elements"<<endl;
 cout<<" [ 03 ] Insert"<<endl;





 cout<<" [ 04 ] Display"<<endl;
 cout<<" [ 05 ] Delete"<<endl;
 cout<<" [ 06 ] Sort"<<endl;
 cout<<" [ 07 ] Union"<<endl;
 cout<<" [ 08 ] Intersaction"<<endl;
 cout<<" [ 09 ] Reverse"<<endl;
 cout<<" [ 10 ] Merge Linklist"<<endl;
 cout<<" [ 11 ] Exit"<<endl;
 cout<<" Enter your choice :";
 int ch;
 cin>>ch;
 return ch;
}
