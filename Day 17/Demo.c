#include <stdio.h>
int main()
{
    // int a;
    // char c;
    // printf("Enter the value of a ");
    // scanf("%d", &a);
    // printf("Enter the value of c ");
    // scanf(" %c", &c);
    // // ! give space before %c
    // printf("%d\n",a);
    // printf("%c\n",c);


    //?another way
    int a;
    char c;
    printf("Enter the value of a ");
    scanf("%d", &a);
    getchar();
    printf("Enter the value of c ");
    scanf("%c", &c);
    printf("%d\n",a);
    printf("%c\n",c);

    return 0;
}