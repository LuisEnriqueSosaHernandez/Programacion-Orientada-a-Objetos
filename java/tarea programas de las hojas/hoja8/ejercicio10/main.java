import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int suma=0;
int a;
int d;
System.out.println("Cuantos datos quieres sumar: ");
a=l.nextInt();
for(int i=0;i<a;i++){
System.out.println("Ingresa un dato: ");
d=l.nextInt();
suma+=d;
}
System.out.println("La suma es: "+suma);
}
}