import java.util.Scanner;
public class Calcula{
public static void main(String[]args){
Escuela e = new Escuela();
Scanner Lee=new Scanner(System.in);
System.out.print("Ingresa el numero de materias: ");
e.setMaterias(Lee.nextInt());
System.out.print("Ingresa el costo de las materias: ");
e.setCosto(Lee.nextDouble());

System.out.print("Ingresa el promedio: ");
e.setPromedio(Lee.nextDouble());

System.out.print("El total a pagar del alumno es: "+e.Preciototal()+" Pesos");








}

}

