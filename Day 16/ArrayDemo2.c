#include <stdio.h>
int main()
{
    int a[3][3] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    int size = sizeof(a) / sizeof(a[0]);
    printf("%d\n",size);
    for (int i = 0; i < size; i++)
    {
        for(int j=0;j<3;j++)
        {
            printf("%d ",a[i][j]);
        }
        printf("\n");
    }
    return 0;
}