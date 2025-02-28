#include <stdio.h>
#include <string.h>
// used to create alias(nickname) for datatype
typedef struct EmployeeDetails
{
    int empno;
    char empname[100];
    int salary;
} emp;
int main()
{
    emp e1;
    e1.empno = 201;
    // e1.empname = "raja"; // invalid
    strcpy(e1.empname, "raja");
    e1.salary = 20000;
    printf("The emp no is %d\n", e1.empno);
    printf("The emp name is %s\n", e1.empname);
    printf("The emp salary is %d\n", e1.salary);

    return 0;
}