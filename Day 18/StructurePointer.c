#include <stdio.h>
#include <string.h>
typedef struct student
{
    //? memebers of the student structure
    int regno;
    char name[100];
} stu;
int main()
{
    // struct student s1;
    // s1.name="gopal";//invalid
    // char stdname[100];
    // printf("Enter the name ");
    // scanf("%[^\n]s",s1.name);//to get multiple words
    // fgets(stdname, sizeof(stdname), stdin);
    // strcpy(s1.name, stdname);
    // printf("the student name is %s", s1.name);

    stu s1;
    stu *p = &s1;

    p->regno = 214;
    printf("the regno is %d\n", p->regno);

    // p->name = "hello world";
    strcpy(p->name, "faruook");
    printf("the name is %s", p->name);

    return 0;
}