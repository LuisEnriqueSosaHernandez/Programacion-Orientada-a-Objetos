import java.util.Scanner;
public class UsaMatrices{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
int numero;
int a,b;
System.out.print("Introduce renglones para matriz:");
a=Lee.nextInt();
System.out.print("Introduce columnas para matriz:");
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
System.out.println("Matriz");
for(int i=0;i<matriz.length;i++){
System.out.println("\t");
for(int j=0;j<matriz[0].length;j++){
System.out.print(matriz[i][j].getNumero());
}
}
}
}
