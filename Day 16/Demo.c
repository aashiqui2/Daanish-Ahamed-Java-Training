#include<stdio.h>
int main(){
    
    char c;
    scanf("%c",&c);
    printf("%c\n",c);

    int a;
    scanf("%d",&a);
    printf("%d\n",a);//garbage value
    
    float f;
    scanf("%f",&f);
    printf("%.2f\n",f);//garbage value

    // enter key and \n both are same
    // char d;
    // scanf("%[^/n]c",&d);
    // printf("%c\n",d);
    
return 0;
}