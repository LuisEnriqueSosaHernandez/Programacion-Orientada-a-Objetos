#include <stdio.h>
#include <stdlib.h>
#include "graficos.h"

int main()
{
    int opcion;

    do{
       printf("Introduce una opcion: \n");
       printf("(1) Haremos uso de Directx.\n");
       printf("(2) Haremos uso de OpenGl.\n");
       scanf("%i",&opcion);
    }while(opcion<1||opcion>2);
    graf(opcion);

   system("pause");
    return 0;
}
