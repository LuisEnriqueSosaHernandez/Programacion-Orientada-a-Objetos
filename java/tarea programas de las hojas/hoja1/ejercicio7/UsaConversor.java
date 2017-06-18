import java.util.Scanner;
public class UsaConversor{
public static void main(String[]arg){
Scanner Lee=new Scanner(System.in);
Conversor c=new Conversor();
System.out.print("Ingresa tus dolares para convertirlos: ");
c.setDolar(Lee.nextDouble());
c.Calcula();
}
}