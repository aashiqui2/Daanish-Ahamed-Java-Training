#include <stdio.h>
// void add(int, int);
int add(int, int);
int main()
{
    int a = 5, b = 10;
    int r = add(a, b); // argument
    printf("%d", r);
    return 0;
}

// void add(int n1, int n2) // without return type with argument
// {
//     printf("%d", n1 + n2);
// }

int add(int n1, int n2) // with return type with argument
{

    return n1 + n2;
}