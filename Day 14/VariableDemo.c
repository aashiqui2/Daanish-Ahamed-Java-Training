#include <stdio.h>
int main()
{

    int a = 20;
    int b=40;
    int c = 30;

    {
        int b = 30;//local variable
        printf("%d %d\n",a, b);
    }

    printf("%d %d %d", a, b, c);
    return 0;
}