#include <stdio.h>
int fact = 1;
int factorial(int num)
{
	if (num == 0)
	{
		return fact;
	}
	else
	{
		fact = num * factorial(num-1);
	}
	return fact;
	
	}
int main()
{
	int number;
	printf("Enter the number to find factorial: ");
	scanf("%d",&number);
	number = factorial(number);
	printf("The Factorial is : %d", number);
	return 0;
}
