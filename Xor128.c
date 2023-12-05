#include <stdio.h>
#include <string.h>
void main(){
    char a[20]="Hello world";
    char b[20],c[20],d[20];
    for (int i=0;i<strlen(a);i++)
    {
        b[i]=a[i]^127;
        c[i]=a[i]&127;
        d[i]=a[i]|127;
    }
    printf("XOR : %s \n",b);
    printf("AND : %s \n",c);
    printf("OR : %s \n",d);
}