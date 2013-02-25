/* Program to convert infix expression to an equivalent postfix expression */
#include <stdio.h>
#include <iostream>
using namespace std;
#include <string.h>
class stack
{
	char st[50];
	int top;
	public:
		void in_to_post(char infix[]);
		void push(char);
		char pop();
		stack()
		{
			top=-1;
			
		}


};
void stack::push(char symb)
{
	if(top>=49)
	{
		cout<<"stack overflow";
		return;
		
	
	}
	else
	{
		top=top+1;
		st[top]=symb;
	}


}
char stack::pop()
{
	char item;
	if(top==-1)
	{
		cout<<"stack empty";
		return(0);
	
	}
	else
	{
		item=st[top];
		top--;
	}
	return(item);
}
int preced(char ch)
{
	if(ch==47)
	{
		return(5);
	}
	else if(ch==42)
	{
		return(4);
	}
	else if(ch==43)
	{
		return(3);
	}
	else
	return(2);

}
void stack::in_to_post(char infix[])
{
	int length;
	static int index=0, pos=0;
	char symbol,temp;
	char postfix[40];
	length=strlen(infix);
	push('#');
	while(index < length)
	{
		symbol=infix[index];
		switch(symbol)
		{
			case '(':push(symbol);
				break;
			case ')':temp=pop();
				while(temp!='(')
				{
					postfix[pos]=temp;
					pos++;
					temp=pop();
				}
				break;
			case '+':
			case '-':
			case '*':
			case '/':
			case '^':
			while(preced(st[top] >= preced(symbol)))
			{
				temp=pop();
				postfix[pos]=temp;
				pos++;
				
				
			}
			push(symbol);
			break;
			default:
				postfix[pos++]=symbol;
				break;
			
			
			
		}
		index++;
		
	}
	while(top>0)
	{
		temp=pop();
		postfix[pos++]=temp;
		
	}
	postfix[pos++]='\0';
	puts(postfix);
	return;
	
}
int main()
{
	stack s;
	char infx[25];
	cout<<"Enter the infix expression ";
	gets(infx);
	s.in_to_post(infx);
	return 0;
}
