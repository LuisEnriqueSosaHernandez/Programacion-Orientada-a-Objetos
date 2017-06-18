#include <stdio.h>
#include <stdlib.h>
int suma(int a,int b);
int suma_in(int a,int b,int res);
int main()
{
    int res_suma;
    res_suma=suma(8,25);
    printf("El resultado de la suma es : %d.\n",res_suma);
    getch();
    return 0;
}
int suma(int a,int b){
return suma_in(a,b,0);
}
int suma_in(int a,int b,int res){
if(a==0){
   return res+b;
}
else{
    suma_in(a-1,b,res +1);
}
}
