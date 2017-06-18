import java.util.Scanner;
public class Suma{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
Datos d=new Datos();
int suma=0;
for(int i=0;i<6;i++){
System.out.println("Ingresa un dato: ");
d.setNumero(Lee.nextInt());
suma+=d.numero;
}
System.out.println("La suma es: "+suma);
}
}