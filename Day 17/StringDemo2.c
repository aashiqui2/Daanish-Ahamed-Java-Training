#include <stdio.h>
int main()
{
    // char c[6];
    // printf("enter the string ");
    // scanf("%s", c);
    // printf("%s", c);

    //? we can get a string beyond its length it is a abnormal behaviour to solve this buffer overflow we get fgets() function
    //? we cannot get multiple worlds by scanf()

    // char c[10];
    //  printf("enter the string ");
    // scanf("%[^\n]s", c);
    // [^\n] -> scanset to eleminate '\n'
    // printf("%s", c);

    //  gets,fgets,puts,putc,getc,fprintf,fscanf,sprintf,sscanf

    //! fgets puts
    // char c[12];
    // printf("enter the string ");
    // fgets(c, sizeof(c), stdin); //(n-1)
    // printf("%s", c);
    // puts(c);//append \n to the string
    // puts(c);

    //!putc
    // char c = 'a';
    // putc(c, stdout);

   
    putc('h',stdout);
    putc('\n',stdout);
    putc('e',stdout);
    putc('l',stdout);
    putc('l',stdout);
    putc('o',stdout);
    

    return 0;
}