import java.util.Scanner;
public class UsaNumero{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
Numero n= new Numero();
System.out.print("Ingresa un valor numerico: ");
n.setA(Lee.nextDouble());
n.Evalua();
}
}