/* program to check the number is factorial or not : looping */
#include <stdio.h>
int main()
{
    int fact=1, number,i;
    printf("Enter the number: ");
    scanf("%d", &number);
    
    for(i=1;i<=number;i++)
    {
		fact = fact * i;
		
	}
	
	printf("The Factorial of %d is %d", number, fact);
	return 0;
}
