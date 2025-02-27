#include <stdio.h>
void printSum(int start, int end, int sum)
{
    if (start == end)
    {
        sum += start;
        printf("%d ", sum);
        return;
    }
    sum += start;
    printSum(start + 1, end, sum);
}

void fib(int a, int b, int n)
{
    if (n == 0)
    {
        return;
    }
    int c = a + b;
    printf("%d ", c);
    fib(b, c, n - 1);
}

int fact(int n)
{
    if (n == 0)
    {
        return 1;
    }
    return n * fact(n - 1);
}

int main()
{
    // int sum = 0;
    // for (int i = 1; i <= 5; i++)
    // {
    //     sum += i;
    // }
    // printf("%d ", sum);

    // printSum(1, 5, 0);

    // int a = 0, b = 1;
    // printf("%d %d ", a, b);

    // for (int i = 1; i < 5; i++)
    // {
    //     int c = a + b;
    //     printf("%d ", c);
    //     a = b;
    //     b = c;
    // }

    // fib(a, b, 4);

    // int fact = 1;
    // for (int i = 1; i <= 5; i++)
    // {
    //     fact = fact * i;
    // }
    // printf("%d", fact);

    printf("%d", fact(5));
    return 0;
}