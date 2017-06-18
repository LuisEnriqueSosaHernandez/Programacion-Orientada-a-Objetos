import java.util.Scanner;
public class UsaConversor{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
Conversor c=new Conversor();
System.out.println("Ingresa el valor inicial de la conversion");
c.setC(Lee.nextInt());
System.out.println("Ingresa el valor final de la conversion");
c.setB(Lee.nextInt());
c.Convierte();
c.Convierte2();
}
}