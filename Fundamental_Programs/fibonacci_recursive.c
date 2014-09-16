#include <stdio.h>
int fibo = 1;
int fibonacci(int num)
{
	if (num == 0)
		return 0;
	else if(num == 1)
		return 1;
	else
		return (fibonacci(num -1) + fibonacci(num-2));
}
int main()
{
	int number,i;
	printf("Enter the number to find fibonacci series: ");
	scanf("%d",&number);
	printf("fibonacci series: ");
	for(i=1;i<=number;i++)
	{
		printf("\n %d",fibonacci(i));
	}
	
	return 0;
	}
