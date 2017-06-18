import java.util.Scanner;
public class Hexagono{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
Barrenos b=new Barrenos();

System.out.println("Dame el valor del radio del primer cilindro:");
b.setRabarreno(Lee.nextDouble());

System.out.println("Dame el valor del radio del segundo cilindro:");
b.setRabarrenodos(Lee.nextDouble());

System.out.println("Dame el valor de la altura del hexagono:");
b.setH(Lee.nextDouble());

System.out.println("Dame el valor del lado del hexagono:");
b.setL(Lee.nextDouble());

System.out.println("Dame el valor del apotema:");
b.setAp(Lee.nextDouble());


b.Volumen();
b.Volumen2();
b.Basehexagono();
}


}