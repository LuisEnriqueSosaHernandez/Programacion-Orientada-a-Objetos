#include <stdio.h>
#include <stdlib.h>
int suma(int num1,int num2);
int producto(int num1,int num2);
int main()
{
   int num1,num2,res;
   printf("Introduce dos numeros que se sumaran y se multiplicaran de forma recursiva\n");
   printf("Numero1: ");
   scanf("%d",&num1);
   printf("Numero2: ");
   scanf("%d",&num2);
   res = suma(num1,num2);
   printf("El resultado de la sum de %d+%d=%d.\n",num1,num2,res);
   res = producto(num1,num2);
   printf("El resultado del producto de %d*%d=%d.\n",num1,num2,res);
   getch();
   return 0;
}
int suma(int num1,int num2){
    if(num2==0){
        return num1;
    }
    else{
        return 1+suma(num1,num2-1);

    }
}
    int producto(int num1,int num2){
    if(num2==1){
        return num1;
    }
    else{
        return num1+producto(num1,num2-1);
    }
    }
