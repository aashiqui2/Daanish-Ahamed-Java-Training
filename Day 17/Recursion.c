#include <stdio.h>
void printN(int, int);
void printNR(int s, int e)
{
    if(s==e)
    {
        printf("%d ",s);
        return;
    }
    printf("%d ", s);
    printNR(s-1,e);
}
int main()
{

    // for (int i = 1; i <= 5; i++)
    // {
    //     printf("%d ", i);
    // }
    // printN(1, 5);

    // for(int i=5;i>=1;i--)
    // {
    //     printf("%d ",i);
    // }

    printNR(5, 1);
    return 0;
}

void printN(int s, int e)
{
    if (s == e)
    {
        printf("%d ", s);
        return;
    }
    printf("%d ", s);
    printN(s + 1, e);
}
