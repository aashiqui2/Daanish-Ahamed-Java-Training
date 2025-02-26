#include<stdio.h>
#define B 25//global variable, by default it is integer
int main(){
    int a=20;//local variable
    a=30;
    a++;
    printf("%d \n",a);
    const float PI=3.14;
    // PI=3.8;//invalid
    printf("%.2f",PI);
    // const int F;
    // F=20; //invalid
    printf("\n");
    printf("%d ",B);
    // B=40;
    // printf("%d ",B); //invalid
return 0;
}