import java.util.Scanner;
public class Main{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
Empleado_sindicalizado es=new Empleado_sindicalizado();
Empleado_deconfianza ed=new Empleado_deconfianza();
System.out.println("Empleado Sindicalizado: ");
System.out.println("Cual es el nombre: ");
es.setNombre(Lee.next());
System.out.println("Cual es la edad: ");
es.setEdad(Lee.nextInt());
System.out.println("Cual es el salario: ");
es.setSalario(Lee.nextDouble());
System.out.println("Cual es el numero de registro sindicical: ");
es.setNumregistro(Lee.nextInt());
System.out.println("Cual es la cuota sindical: ");
es.setCuota(Lee.nextDouble());
System.out.println("Que porcentaje quieres aumentar al salario: ");
es.setAumento(Lee.nextDouble());
es.clasifica();
es.Imprime2();
es.aumenta();
System.out.println("\n");
System.out.println("Empleado de confianza: ");
System.out.println("Cual es el nombre: ");
ed.setNombre(Lee.next());
System.out.println("Cual es la edad: ");
ed.setEdad(Lee.nextInt());
System.out.println("Cual es el salario: ");
ed.setSalario(Lee.nextDouble());
System.out.println("Cuanto es la cuota de servicio medico: ");
ed.setCuotamedica(Lee.nextDouble());
System.out.println("Que porcentaje quieres aumentar al salario: ");
ed.setAumento(Lee.nextDouble());
ed.clasifica();
ed.Imprime3();
ed.aumenta();







}
}