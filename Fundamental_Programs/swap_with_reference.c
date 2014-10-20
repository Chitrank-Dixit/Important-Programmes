/* swap with reference */
#include <stdio.h>
void swap(int *a, int *b)
{
	int temp;
	temp = *a;
	*a = *b;
	*b= temp;
	

	
	}
int main()
{
	int m,n;
	printf("Enter the values of m and n: ");
	scanf("%d%d", &m, &n);
	swap(&m,&n);
	printf("The value of m: %d\n",m);
	printf("The value of n: %d",n);
	return 0;
}
