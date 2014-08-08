/* Biggest of the 3 */
#include <stdio.h>
int main()
{
    int a, b, c;
    printf("Enter three numbers: ");
    scanf("%d%d%d", &a,&b,&c);
    if ((a>b) && (a>c))
    {
        printf("A = %d is greatest", a);
    }
    else if ((b>a) && (b>c))
    {
        printf("B = %d is greatest", b);
    }
    else if ((c>a) && (c>b))
    {
        printf("C = %d is greatest", c);
    }
    else
    {
        printf("All are equal");
    }
    return 0;
}
