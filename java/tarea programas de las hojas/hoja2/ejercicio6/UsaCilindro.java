import java.util.Scanner;
public class UsaCilindro{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
Cilindro c =new Cilindro();
System.out.print("Cual es la altura del cilindro: ");
c.setH(Lee.nextDouble());

System.out.print("Cual es el radio del cilindro: ");
c.setR(Lee.nextDouble());
c.Volumen();
}


}