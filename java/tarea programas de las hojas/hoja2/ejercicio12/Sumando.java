import java.util.Scanner;
public class Sumando{
public static void main(String[]args){
Suma s=new Suma();
Scanner Lee=new Scanner(System.in);

System.out.print("Cuantos numeros quieres promediar: ");
s.setA(Lee.nextInt());

s.Sumando();

}
}