#include <stdio.h>
int main()
{
    int n;
    scanf("%d ", &n);

    char c;
    scanf("%c",&c);

    float f;
    scanf("%f",&f);

    double d;
    scanf("%lf",&d);

    printf("%d %c %.2f %lf",n,c,f,d);

    return 0;
}