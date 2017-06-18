#include <stdio.h>
#include <stdlib.h>
#define N 5
int fun(int m[N][N]);
int fun_final(int m[N][N],int i,int j);

int main()
{
    int resultado;
    int m[N][N]={
    {1,2,3,4,5},
    {2,1,2,3,4},
    {3,2,1,2,3},
    {4,3,2,1,2},
    {5,4,3,2,1}
    };
    resultado =fun(m);
    if(resultado==1){
        printf("La matriz es SIMETRICA.");
    }
    else{
        printf("La matriz no es SIMETRICA.");
    }
    getch();
return 0;
}
int fun(int m[N][N]){
return fun_final(m,0,1);
}
int fun_final(int m[N][N],int i,int j){
if(i==N-1){
    return 1;
}
else{
    if(m[i][j]!=m[j][i]){
        return 0;
    }
    else{
        if(j==N-1){
            return fun_final(m,i+1,i+2);
        }
        else{
            return fun_final(m,i,j+1);
        }
    }
}
}
