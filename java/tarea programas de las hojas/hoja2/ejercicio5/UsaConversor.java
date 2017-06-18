import java.util.Scanner;
public class UsaConversor{
public static void main(String[]arg){
Scanner Lee=new Scanner(System.in);
Conversor c=new Conversor();
System.out.print("Cuanto vale el dolar en pesos: ");
c.setDolar(Lee.nextDouble());
System.out.print("Ingresa tus pesos para convertirlos: ");
c.setPesos(Lee.nextDouble());
c.Calcula();
}
}