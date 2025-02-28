#include <stdio.h>
typedef union Employee
{
    int x;
    char c;
} emp;
int main()
{
    // emp e1 = {2, 'c'}; invalid way
    emp e1;
    e1.x = 65;
    e1.c = 'd';
    printf("the vaulue of x is %d\n", e1.x);
    printf("the char in c is %c\n", e1.c);
    printf("the size of union is %d", sizeof(emp));
    return 0;
    /* whenever you assingn value to the union memeber
           the other member will also affect */
}