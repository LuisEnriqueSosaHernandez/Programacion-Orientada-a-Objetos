import java.util.Scanner;
public class UsaArreglo{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
int numero;
int a;
System.out.print("Introduce una dimension para el arreglo:");
a=Lee.nextInt();
Arreglo[] arreglo=new Arreglo[a];
System.out.println("\n");
for(int i=0;i<arreglo.length;i++){
System.out.print("Introduce tu valor para arreglo: "+"["+i+"]"+":");
numero=Lee.nextInt();
arreglo[i]=new Arreglo(numero);
}
System.out.println("\n");
System.out.println("Arreglo");
for(int i=0;i<arreglo.length;i++){
System.out.print(arreglo[i].getNumero());
}
System.out.println("\n");
System.out.println("Arreglo");
for(int i=0;i<arreglo.length;i++){
System.out.println(arreglo[i].getNumero());
}
}
}
