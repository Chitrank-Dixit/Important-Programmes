// Program to display the contents of pointers using array of pointers
#include <iostream>

using namespace std;
int main()
{
	char *ptr[3];
	ptr[0]="Hello!";
	ptr[1]="How are";
	ptr[2]="you";
	cout<<ptr[0]<<ptr[1]<<ptr[2];
	return 0;
}
