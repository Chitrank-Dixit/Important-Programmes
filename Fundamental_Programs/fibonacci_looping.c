/* program to print Fibonacci Series: looping */
#include <stdio.h>
int main()
{
    int number,i, f1=0, f2=1, f3=0;
    printf("Enter the number: ");
    scanf("%d", &number);
    printf("The following Series is: ");
    for(i=1;i<=number;i++)
    {
		printf("\n %d", f3);
		f1=f2;
		f2=f3;
		f3=f1+f2;
		
	}
	return 0;
}
