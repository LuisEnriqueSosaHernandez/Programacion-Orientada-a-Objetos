#include <stdio.h>
#include <stdlib.h>
#include "lib.h"

int main()
{

int **mat;
mat=reservar(2,2);
introduce(2,2,mat);
muestra(2,2,mat);
system("pause");
    return 0;
}
