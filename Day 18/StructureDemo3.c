#include <stdio.h>
typedef struct studentDetailsForCollege
{  
    // ?structure memeber
    int a;//4
    char c;//1
    char name[10];//10
    float regno;//4
    double batch;//8
} stu;
int main()
{
    printf("The size of my datatype is %d", sizeof(stu));

    return 0;
}