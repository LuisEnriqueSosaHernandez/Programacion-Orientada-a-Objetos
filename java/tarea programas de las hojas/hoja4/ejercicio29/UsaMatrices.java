import java.util.Scanner;
public class UsaMatrices{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
int numero;
int a,b,c,d;
System.out.print("Introduce un ancho para matriz1:");
a=Lee.nextInt();
System.out.print("Introduce un largo para matriz1:");
b=Lee.nextInt();
Matrices[][] matriz=new Matrices[a][b];
System.out.println("\n");
for(int i=0;i<matriz.length;i++){
for(int j=0;j<matriz[0].length;j++){
System.out.print("Introduce tu valor para matriz: ["+i+"]"+"["+j+"]: ");
numero=Lee.nextInt();
matriz[i][j]=new Matrices(numero);
}
}
System.out.println("\n");
System.out.print("Introduce un ancho para matriz2:");
c=Lee.nextInt();
System.out.print("Introduce un largo para matriz2:");
d=Lee.nextInt();
Matrices[][] matriz2=new Matrices[c][d];

System.out.println("\n");
for(int i=0;i<matriz2.length;i++){
for(int j=0;j<matriz2[0].length;j++){
System.out.print("Introduce tu valor para matriz2: ["+i+"]"+"["+j+"]: ");
numero=Lee.nextInt();
matriz2[i][j]=new Matrices(numero);
}
}
System.out.println("\n");
System.out.println("Matriz1");
for(int i=0;i<matriz.length;i++){
System.out.println("\t");
for(int j=0;j<matriz[0].length;j++){
System.out.print(matriz[i][j].getNumero());
}
}
System.out.println("\n");
System.out.println("Matriz2");
for(int i=0;i<matriz2.length;i++){
System.out.println("\t");
for(int j=0;j<matriz2[0].length;j++){
System.out.print(matriz2[i][j].getNumero());
}
}
}
}
