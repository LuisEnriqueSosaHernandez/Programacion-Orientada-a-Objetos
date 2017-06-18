import java.util.Scanner;
public class UsaResta{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
Resta r=new Resta();

System.out.print("Ingresa el valor de sustraendo: ");
r.setNuma(Lee.nextInt());
System.out.print("Ingresa el valor de minuendo: ");
r.setNumb(Lee.nextInt());

System.out.println("La resta es igual a: "+r.regresa1());
System.out.println("si le sumamos la resta al minuendo van a ser iguales los numeros: ");
System.out.println("El valor del sustraendo : "+r.regresa2());
System.out.println("El valor del minuendo : "+r.regresa3());



}


}