#include <stdio.h>
#include <string.h>
void main(){
    char a[20]="hello world";
    char b[20];
    for (int i=0;i<strlen(a);i++)
    {
        b[i]=a[i]^0;
    }
    printf("%s",b);
}