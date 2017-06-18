import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
System.out.println("De que dimesiones quieres tu matriz: ");
int a=l.nextInt();
int b=l.nextInt();
double x=0;
int[][] matriz=new int[a][b];

for(int i=0;i<matriz.length;i++){
for(int j=0;j<matriz[0].length;j++){
System.out.println("Ingresa un valor ");
matriz[i][j]=l.nextInt();
}
}
System.out.println("Matriz original");
for(int i=0;i<matriz.length;i++){
	System.out.println("");
for(int j=0;j<matriz[0].length;j++){
System.out.print(matriz[i][j]+" ");

}
}
System.out.println("");

for(int i=0;i<matriz.length;i++){
x=0;
for(int j=0;j<matriz[0].length;j++){
x+=matriz[i][j];
}
System.out.println("El promedio para el renglon :"+(i+1)+" es: "+(x/a));
}

}
}