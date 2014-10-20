#include <stdio.h>
#define DAYSINWEEK 7
 
int main()
{
    int ndays, year, week, days;
 
    printf("Enter the number of daysn");
    scanf("%d", &ndays);
    year = ndays / 365;
    week =(ndays % 365) / DAYSINWEEK;
    days =(ndays % 365) % DAYSINWEEK;
    printf ("\n%d is equivalent to %d years, %d weeks and %d daysn",ndays, year, week, days);
    return 0;
}
