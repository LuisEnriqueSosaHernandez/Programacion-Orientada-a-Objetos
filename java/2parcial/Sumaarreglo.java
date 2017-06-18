import java.util.Scanner;
public class Sumaarreglo{
Scanner Lee=new Scanner(System.in);
double a;
double[] num= new double[10];
double[] num2= new double[10];
public void llena1(){
System.out.println("\n");
System.out.println("Introduce datos para el arreglo 1:");
for(int i=0;i<10;i++){
System.out.print("Introduce un numero: ");
num[i]=Lee.nextDouble();
}
}
public void llena2(){
System.out.println("\n");
System.out.println("Introduce datos para el arreglo 2:");
for(int i=0;i<10;i++){
System.out.print("Introduce un numero: ");
num2[i]=Lee.nextDouble();
}
System.out.println("\n");
System.out.println("Tus datos del arreglo 1 son:");
for(int i=0;i<10;i++){
System.out.print(num[i]+" ");
}
System.out.println("\n");
System.out.print("\n");
System.out.println("Tus datos del arreglo 2 son:");
for(int i=0;i<10;i++){
System.out.print(num2[i]+" ");
}
}
public void Suma(){
System.out.print("\n");
System.out.println("\n");
System.out.println("La suma de cada uno de los elementos del arreglo es:");
for(int i=0;i<10;i++){
a=num[i]+num2[i];
System.out.print(a+" ");
}
}
public void Resta(){
System.out.print("\n");
System.out.println("\n");
System.out.println("La Resta de cada uno de los elementos del arreglo es:");
for(int i=0;i<10;i++){
a=num[i]-num2[i];
System.out.print(a+" ");
}
}
}