/* C program to check whether a given number is positive or negative */
#include <stdio.h>
int main()
{
    int num;
    printf("Enter any number to check whether it is positive or negative: ");
    scanf("%d", &num);
    if (num == 0)
    {
        printf("The number is %d \n", num);
    }
    
    if (num < 0)
    {
        printf("The number %d is negative \n", num);
    }
    else
    {
        printf("The number %d is positive", num);
    }
    return 0;

}
