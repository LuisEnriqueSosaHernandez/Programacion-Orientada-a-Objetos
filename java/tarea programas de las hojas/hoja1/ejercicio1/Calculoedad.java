import java.util.Scanner;
public class Calculoedad{
public static void main(String[]arg){
Scanner Lee=new Scanner(System.in);
Persona p = new Persona();
System.out.print("Ingresa el ano de nacimiento: ");
p.setAnodenacimiento(Lee.nextInt());

System.out.println("Tu edad en el ano 2015 es: "+p.CalculaEdad());
}
}