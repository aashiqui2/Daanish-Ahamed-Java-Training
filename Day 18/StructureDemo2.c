#include <stdio.h>
typedef struct studentDetailsForCollege
{
    char name[10];
    int regno;
    int batch;
} stu;
int main()
{
    stu s1;
    printf("Enter the regno ");
    scanf("%d", &s1.regno);
    printf("%d\n", s1.regno);

    // printf("Enter the name");
    // scanf("%s", s1.name);
    // fgets(s1.name, sizeof(s1.name), stdin);
    // append \n  to s1.name automatically
    // printf("the name is %s", s1.name);

    printf("the size of my datatype is %d", sizeof(stu));

    return 0;
}