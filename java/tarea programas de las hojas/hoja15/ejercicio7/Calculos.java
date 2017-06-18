import java.util.Scanner;
public class Calculos{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
Sar s=new Sar();
System.out.print("Cual es tu salario: ");
s.setSalario(Lee.nextDouble());

System.out.print("Que tipo de cuota quieres: ");
s.setDecide(Lee.nextInt());



System.out.print("Tu cuota sera de: "+s.Calculacuota());
}

}

