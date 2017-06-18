import java.util.Scanner;
public class Paga{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
Sueldo s=new Sueldo();

System.out.print("Cuantas horas trabajaste?: ");
s.setHoras(Lee.nextInt());	
System.out.print("Tu sueldo es de: "+s.Total()+" pesos");
}

}