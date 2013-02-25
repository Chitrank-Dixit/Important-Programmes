/* Program accepts postfix expression to calculate the expressions for that values */

#include <stdio.h>
#include <iostream>

#include <string.h>
#include <math.h>
#include <ctype.h>
using namespace std;
class example
{
	private:
	float stack[10];
	int top;
	public:
		void push(char);
		float pop();
		float eval(char[],float[]);
		example()
		{
			top=-1;
			
		}


};
float example::eval(char suffix[],float data[])
{
	int i=0;
	float op1,op2,res;
	char ch;
	while(suffix[i]!='\0')
	{
		ch=suffix[i];
		if(isalpha(suffix[i]))
		{
			push(data[i]);
		}
		else
		{
			op1=pop();
			op2=pop();
			switch(ch)
			{
				case '+':
					push(op1 + op2);
					break;
				case '-':
					push(op1 - op2);
					break;
				case '*':
					push(op1 * op2);
					break;
				case '/':
					push(op1 / op2);
					break;
				case '^':
					push(pow(op1,op2));
					break;
				
				
				
			}
		}
		i++;
		
		
	}
	res=pop();
	return(res);

}
void example::push(char num)
{
	top=top+1;
	stack[top]=num;
	
	
}
float example::pop()
{
	float num;
	num=stack[top];
	top=top-1;
	return(num);
	
}
int main()
{
	example obj;
	int i=0;
	char suffix[20];
	float value[20],result;
	cout<<"Enter a valid postfix expression ";
	gets(suffix);
	while(suffix[i]!='\0')
	{
		if(isalpha(suffix[i]))
		{
			fflush(stdin);
			cout<<endl<<"Enter the value of "<<suffix[i];
			cin>>value[i];
		}
		i++;
		
		
	}
	result=obj.eval(suffix,value);
	cout<<"The result= "<<result;
	return 0;
	
}
