import java.util.Scanner;
public class UsaNumeros{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
Numeros n=new Numeros();

System.out.print("Introduce un numero: ");
n.setNum1(Lee.nextDouble());
System.out.print("Introduce un segundo numero: ");
n.setNum2(Lee.nextDouble());
n.Compara();
}

}