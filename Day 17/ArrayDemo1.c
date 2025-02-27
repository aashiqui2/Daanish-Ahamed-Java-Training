#include <stdio.h>
int main()
{
    int row, col;
    printf("Enter the no of rows ");
    scanf("%d", &row);
    printf("Enter the no of column ");
    scanf("%d", &col);
    int a[row][col];
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            scanf("%d", &a[i][j]);
        }
    }
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < col; j++)
        {
            printf("%d ", a[i][j]);
        }
        printf("\n");
    }

    return 0;
}