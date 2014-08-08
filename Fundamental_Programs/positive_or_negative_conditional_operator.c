/* C program to check whether a given number is positive or negative 
    using Ternary/Conditional Operator
*/
#include <stdio.h>
int main()
{
    int num;
    printf("Enter any number to check whether it is positive or negative: ");
    scanf("%d", &num);
    if (num == 0)
    {
        printf("The number is %d", num);
    }
    (num < 0 ) ? printf("The number %d is negative \n", num) : printf("The number %d is positive \n", num);
    return 0;

}
