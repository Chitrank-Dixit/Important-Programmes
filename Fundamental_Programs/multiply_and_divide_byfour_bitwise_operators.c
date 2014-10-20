/* multiply and divide by 4 using bitwise operator */
#include <stdio.h>
int main()
{
	int number;
	printf("Enter the number to divide by 4: ");
	scanf("%d", &number);
	printf("\n%d X 4 = %d", number, (number << 2));
	printf("\n%d / 4 = %d", number, (number >> 2));
	return 0;
	}
