#include <stdio.h>
void swap(int a, int b)
{
	int temp;
	temp=a;
	a=b;
	b=temp;
	printf("The value of a: %d\n", a);
	printf("The value of b: %d\n", b);
	
	}

int main()
{
	int m,n;
	printf("Enter the value of the two numbers: ");
	scanf("%d%d", &m,&n);
	swap(m,n);
	return 0;

}
