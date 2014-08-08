/* using Ternary/Conditinal Operator */

#include <stdio.h>
int main()
{
    int number;
    printf("Enter the number to find even or odd: ");
    scanf("%d", &number);
    (number % 2 == 0) ? printf("The number %d is even \n", number) : printf("The number %d is odd \n", number);
    return 0;
}
