/* program to swap two values without using a third variable simple operation */
#include <stdio.h>
int main()
{
    long i, k;
    printf("Enter the two values: ");
    scanf("%ld %ld", &i, &k);
    printf("\nValue of I= %ld and K=%ld" , i,k);
    i = i + k;
    k = i - k;
    i = i - k;
    printf("\nValue of I= %ld and K=%ld after swap" , i,k);
    return 0;
}
