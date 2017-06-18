import java.util.Scanner;
public class UsaConversor{
public static void main(String[]args){
Conversor c=new Conversor();
Scanner Lee=new Scanner(System.in);

System.out.print("Ingresa cuantos grados quieres convertir: ");
c.setGrados(Lee.nextDouble());

System.out.println("Equivalen a: "+c.Convierte()+" Radianes");

}
}