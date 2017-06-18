import java.util.Scanner;
public class UsaNumero{
public static void main(String[]arg){
Scanner Lee=new Scanner(System.in);
Numero n=new Numero();
System.out.print("Ingresa un valor para numero1: ");
n.setNum1(Lee.nextDouble());
System.out.print("Ingresa un valor para numero2: ");
n.setNum2(Lee.nextDouble());

n.Operacion();

}
}