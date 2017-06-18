import java.util.Scanner;
public class UsaCircunferencia{
public static void main(String[]args){
Circunferencia c = new Circunferencia();
Scanner Lee=new Scanner(System.in);
System.out.print("Ingresa el valor del diametro: ");
c.setDiametro(Lee.nextDouble());
c.radio=c.diametro/2;
c.longitud=2*3.1416*c.radio;
System.out.print("El valor de la longitud es: "+c.longitud);
}
}