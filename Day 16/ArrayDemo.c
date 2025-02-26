#include <stdio.h>
int main()
{
    int a[] = {1, 2, 3, 4, 5};
    // printf("%d",a);
    int size = sizeof(a) / sizeof(a[0]);
    for (int i = 0; i < size; i++)
    {
        printf("%d ", a[i]);
    }
    printf("\nSize :%d ", size);

    return 0;
}