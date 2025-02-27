#include <stdio.h>
int main()
{
    int a = 23;
    // int *p = &a;
    int *p;
    p = &a;

    printf("Address of a %u\n",&a);
    printf("Address of p %u\n",&p);
    printf("Address of stored inside pointer p %u\n",p);
    printf("VALUE of a %d\n",a);
    printf("Value stored in the pointer  p %u\n",*p);

    return 0;
}