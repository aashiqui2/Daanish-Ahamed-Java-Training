#include<stdio.h>
#define PI 3.14f //macro global variable
int main(){
    // const float PI=3.14f;
    // PI=3.15;
    // constant cannot be modified
    
    //! error
    // const float PI;//declaration
    // PI=3.14f;initialization
    printf("%.2f",PI);
return 0;
}