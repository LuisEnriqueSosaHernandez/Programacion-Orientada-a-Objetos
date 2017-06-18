#include "graficos.h"
static void directx(){
printf("Hemos elegido la opcion Directx.\n");
}
static void opengl(){
printf("Hemos elegido la opcion OpenGl.\n");

}
void graf(int opcion){
switch(opcion){
case 1:
directx();
break;
case 2:
    opengl();
    break;

}

}
