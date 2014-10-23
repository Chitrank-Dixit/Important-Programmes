/* sum of digits in the integer */
#include <stdio.h>
int main()
{
	int number, sum=0, digit;
	printf("Enter the number to find the sum of digits: ");
	scanf("%d", &number);
	printf("The number entered is: %d", number);
	while (number > 0)
	{
		digit = number % 10;
		sum = sum + digit;
		number /= 10;
		}
	printf("\nSum of Digits are: %d", sum);
	return 0;
}
