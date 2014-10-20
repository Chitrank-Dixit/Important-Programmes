/* convert the number of days in years, weeks and months */
#include <stdio.h>
int main()
{
	int days, months, years, weeks;
	printf("Enter the number of Days: ");
	scanf("%d", &days);
	months = days / 30;
	years = days / 365;
	weeks = days / 7;
	printf("\nWeeks: %d", weeks);
	printf("\nMonths: %d", months);
	printf("\nYears: %d", years);
	return 0;
}
