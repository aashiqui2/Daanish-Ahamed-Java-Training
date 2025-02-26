#include <stdio.h>
int main()
{
    int n;
    printf("Enter the row ");
    scanf("%d", &n);

    // for (int i = 0; i < n; i++)
    // {
    //     for (int j = 0; j <= i; j++)
    //     {
    //         printf("*");
    //     }
    //     printf("\n");
    // }
    // for (int i = 0; i <n; i++)
    // {
    //     for (int j = 0; j <n - i;j++)
    //     {
    //         printf("*");
    //     }
    //     printf("\n");
    // }

    // int count=1;
    // for (int i = 0; i <n; i++)
    // {
    //     for (int j = 0; j <=i;j++)
    //     {
    //         printf("%d ",count);
    //         count++;
    //     }
    //     printf("\n");
    // }

    // for (int i = 1; i < n * 2; i++)
    // {
    //     int star = (i > n) ? (2 * n) - i : i;
    //     for (int j = 1; j <= star; j++)
    //     {
    //         printf("*");
    //     }
    //     printf("\n");
    // }

    // for (int i = 1; i <= n; i++)
    // {
    //     for (int j = 1; j <= n - i; j++)
    //     {
    //         printf(" ");
    //     }
    //     for(int k=1;k<2*i;k++)
    //     {
    //         printf("*");
    //     }
    //     printf("\n");
    // }

    for (int i = 0; i < n; i++)
    {
        for (int j = i; j > 0; j--)
        {
            printf(" ");
        }
        for (int k = 2 * (n - i); k > 1; k--)
        {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}