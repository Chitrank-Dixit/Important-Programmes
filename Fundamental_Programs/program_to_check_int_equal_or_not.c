/* program to check the two integers are equal or not */
#include <stdio.h>
int main()
{
	int a,b;
	printf("Enter the value of the two integers: ");
	scanf("%d%d", &a, &b);
	if (a==b)
		printf("Integer %d and %d are equal", a, b);
	else
		printf("Integer %d and %d are not equal", a, b);
	return 0;
}
