import java.util.Scanner;
public class Usapulsaciones{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
Persona p=new Persona();
System.out.print("Cual es tu edad: ");
p.setEdad(Lee.nextDouble());
System.out.print("Cual es tu sexo 1=masculino 2=femenino: ");
p.setSexo(Lee.nextDouble());
System.out.print("Tus pulsaciones deben ser: "+p.total()+" por cada 10 segundos");
}

}