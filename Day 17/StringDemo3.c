#include <stdio.h>
#include <string.h>
int main()
{
    //! strlen,strcmp,strcat,strcpy,strrev

    // char c1[] = "hello";
    // char c2[] = "Hello";
    // c1==c2 return 0, s1<s2 negative value, s1>s2 positive value
    // printf("%d", strcmp(c1, c2));
    // if (strcmp(c1, c2)==0)
    // {
    //     printf("same");
    // }
    // else
    // {
    //     printf("not");
    // }

    // -----------------------------------------------------

    //? strcpy
    // char c[] = "hello world";
    // char c1[12];

    // strcpy(c1, c);
    // puts(c1);

    // --------------------------------------------------------

    // ?strcat
    // char c[100] = "hello ";
    // char c1[] = "world!";
    // strcat(c, c1);
    // puts(c);

    //-------------------------------------------------------

    //? strrev
    char c[] = "hello";
    strrev(c);
    puts(c);

    return 0;
}