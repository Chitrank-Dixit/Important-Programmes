/* using recursion */
#include <stdio.h>
int sum_all(int range, int even_sum, int odd_sum)
{
    if(range == 0)
    {
        printf("\nEven Sum: %d", even_sum);
        printf("\nOdd Sum: %d", odd_sum);
        return 0;
    }
    else
    {
        if(range % 2 == 0)
        {
            even_sum= even_sum + range;
        }
        else if(range % 2 == 1)
        {
            odd_sum =  odd_sum + range;
        }
        else
        {
            printf("Invalid Operation");
        }
        sum_all(range - 1, even_sum, odd_sum);
    }
    return 0;
}
int main()
{
    int i=0,range,odd_sum=0, even_sum=0;
    printf("Enter the range for odd and even nos sum: ");
    scanf("%d", &range);
    i = sum_all(range, even_sum, odd_sum);
    printf("\nEven Sum: %d", even_sum);
    printf("\nOdd Sum: %d", odd_sum);
    return 0;

}
