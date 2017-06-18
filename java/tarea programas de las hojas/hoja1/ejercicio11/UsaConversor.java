import java.util.Scanner;
public class UsaConversor{
public static void main(String[]arg){
Scanner Lee=new Scanner(System.in);
Conversor c=new Conversor();
System.out.print("Que valor en cm deseas convertir: ");
c.setCm(Lee.nextDouble());
c.Convierte();

}
}