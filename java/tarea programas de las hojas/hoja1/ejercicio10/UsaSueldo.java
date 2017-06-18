import java.util.Scanner;
public class UsaSueldo{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
Sueldo s = new Sueldo();
System.out.print("El salario del trabajador1 es: ");
s.setSalario1(Lee.nextDouble());
System.out.print("El salario del trabajador2 es: ");
s.setSalario2(Lee.nextDouble());
System.out.print("El salario del trabajador3 es: ");
s.setSalario3(Lee.nextDouble());
s.Aumento();



}


}