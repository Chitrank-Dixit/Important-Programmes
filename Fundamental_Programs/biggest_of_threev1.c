#include <stdio.h>
int main()
{
    int a,b,c;
    printf("Enter Three numbers: ");
    scanf("%d%d%d", &a, &b, &c);

    if(a>b)
    {
        if(a>c)
        {
            printf("A = %d is greatest",a);
        }
    }
    else if(b>a)
    {
        if(b>c)
        {
            printf("B = %d is greatest", b);
        }

    }
    else if(c>a)
    {
        if(c>b)
        {
            printf("C = %d is greatest", c);

        }

    }
    else if(a==b)
    {
        if(a==c)
        {
            printf("A = %d , B = %d and C = %d are equal", a,b,c);
        }

    }
    else
    {
        printf("Something else:");
   
    }

    return 0;
}
