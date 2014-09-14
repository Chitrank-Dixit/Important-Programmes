#include <stdio.h>
int main()
{
    int i=0,range,odd_sum=0, even_sum=0;
    printf("Enter the range for odd and even nos sum: ");
    scanf("%d", &range);
    for(i=1;i<=range;i++)
    {
        if(i%2 == 0)
        {
            even_sum = even_sum + i;
        }
        else if(i%2 == 1)
        {
            odd_sum = odd_sum + i;
        }
        else
        {
            printf("May be 0");
        }
    }
    printf("\nEven Sum: %d", even_sum);
    printf("\nOdd Sum: %d", odd_sum);
    return 0;

}
