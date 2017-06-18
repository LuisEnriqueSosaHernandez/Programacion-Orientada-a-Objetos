import java.util.Scanner;
public class UsaFinanzas{
public static void main(String[]args){
Finanzas f=new Finanzas();
Scanner Lee=new Scanner(System.in);

System.out.print("Ingresa el monto: ");
f.setMonto(Lee.nextDouble());

System.out.print("Tu monto a pagar es: "+f.Cuota()+" pesos");


}
}