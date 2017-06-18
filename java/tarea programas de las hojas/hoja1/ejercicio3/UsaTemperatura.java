import java.util.Scanner;
public class UsaTemperatura{
public static void main(String[]arg){
Scanner Lee=new Scanner(System.in);
Temperatura t=new Temperatura();
System.out.print("Ingresa los grados centigrados para convertir a farenheith y a celsius:");
t.setC(Lee.nextDouble());
t.Calcula();
t.Calcula2();


}
}