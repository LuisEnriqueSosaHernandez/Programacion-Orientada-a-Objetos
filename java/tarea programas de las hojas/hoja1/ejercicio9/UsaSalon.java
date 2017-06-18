import java.util.Scanner;
public class UsaSalon{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
Salon s=new Salon();
System.out.print("Cuantos alumnos  tiene: ");
s.setAlumnos(Lee.nextInt());
System.out.print("Cuantas alumnas  tiene: ");
s.setAlumnas(Lee.nextInt());

s.Porcentaje();


}

}