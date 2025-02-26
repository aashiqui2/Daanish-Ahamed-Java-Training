#include <stdio.h>
int main()
{
    int n = 0;
    printf("Enter the no of rows :");
    scanf("%d", &n);
    // for(int i=1;i<=n;i++)
    // {
    //     for(int j=1;j<=n;j++)
    //     {
    //         printf("* ");
    //     }
    //     printf("\n");
    // }
    // for(int i=1;i<=n;i++)
    // {
    //     for(int j=1;j<=i;j++)
    //     {
    //         printf("* ");
    //     }
    //     printf("\n");
    // }
    // for (int i = 0; i < n; i++)
    // {
    //     for (int j = 0; j <n - i; j++)
    //     {
    //         printf("*"); 
    //     }
    //     printf("\n");
    // }
    // for(int i=1;i<=n;i++)
    // {
    //     for(int j=1;j<=i;j++)
    //     {
    //         printf("%d ",j);
    //     }
    //     printf("\n");
    // }
       

    for(int i=1;i<n*2;i++)
    {  
        int noOfStar=(i>n)?(2*n)-i:i;
        for(int j=1;j<=noOfStar;j++)
        {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}