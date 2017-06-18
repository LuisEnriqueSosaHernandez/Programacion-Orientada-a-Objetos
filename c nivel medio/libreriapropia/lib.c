#include "lib.h"

//Reservar memoria dinamica para una matriz de logintud filas y colum y devuelve la matriz dinamica
int reservar(int filas, int colum){

	int i;
	int **mat;
	mat = (int**)malloc(filas*sizeof(int*));
	if(mat == NULL){
		printf("No se ha podido reservar memoria.\n");
		exit(1);
	}

	for(i = 0; i < filas; i++){
		mat[i] = (int*)malloc(colum*sizeof(int));
		if(mat[i] == NULL){
			printf("No se ha podido reservar memoria.\n");
			exit(1);
		}
	}

	return mat;
}


//Recibe una matriz dinamica **mat y le introduce una serie de valores por teclado
void introduce(int filas, int colum, int **mat){
	int i,j;

	for (i = 0; i < filas; i++){
		for (j = 0; j < colum; j++){
			printf("Introduce el valor para el elemento[%i][%i]: ",i,j);
			scanf("%i",&mat[i][j]);
		}
	}
}

//Recibe una matriz dinamica **mat y sus dimensiones y la muestra por pantalla
void muestra(int filas, int colum, int **mat){
	int i, j;

	for(i = 0; i < filas; i++){
		for(j = 0; j < colum; j++){
			printf("%i ", mat[i][j]);
		}
		printf("\n");
	}
}


//Recibe 2 matrices dinamicas y sus longitudes y las compara
void comparar(int filas, int colum, int **m1, int **m2){
	int i, j, aux = 0;

	for (i = 0; i < filas && aux == 0; i++){
		for (j = 0; j < colum && aux == 0; j++){
			if (m1[i][j] != m2[i][j]){
				aux = 1;
			}
		}
	}

	if (aux == 0){
		printf("Ambas matrices SI son iguales.\n");
	}
	else{
		printf("Ambas matrices NO son iguales.\n");
	}
}

