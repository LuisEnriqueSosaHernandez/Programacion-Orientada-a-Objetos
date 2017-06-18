#include <stdio.h>
#include <stdlib.h>
int factorial(int fact);
int main()
{
    int fact;
    printf("Introduce un numero para factorial: ");
    scanf("%d",&fact);
    fact = factorial(fact);
    printf("El resultado ha sido: %d\n",fact);

     getch();
    return 0;
}

int factorial(int fact){
if(fact==0){
    return 1;
}
else{
    return fact*factorial(fact-1);
    }
}
