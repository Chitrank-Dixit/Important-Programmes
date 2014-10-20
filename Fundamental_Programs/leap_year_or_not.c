/* given year is a leap year or not */
#include <stdio.h>
int main()
{
	int year;
	printf("Enter the year to find it is leap or not: ");
	scanf("%d", &year);
	if(year % 4 == 0)
	{
		printf("%d is a leap year", year);
	}
	else
	{
		printf("%d is not a leap year", year);
		}
	return 0;
}
