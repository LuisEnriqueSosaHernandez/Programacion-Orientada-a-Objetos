import java.util.Scanner;
class UsaPromedio{
public static void main(String[]arg){

Scanner Lee = new Scanner(System.in);

Promedio pro=new Promedio();

System.out.print("Cual es el total de alumnos: ");
pro.setnumAlumnos(Lee.nextDouble());

System.out.print("Cual es su edad: ");
pro.setEdades(Lee.nextDouble());

pro.SumaEdades();


pro.CalculaPromedioalum();
}
}
