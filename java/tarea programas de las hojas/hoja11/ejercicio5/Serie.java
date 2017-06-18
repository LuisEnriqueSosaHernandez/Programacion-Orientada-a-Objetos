import java.util.Scanner;
public class Serie{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
Numero n=new Numero();

System.out.println("De que numero quieres empezar la serie: ");
n.setNumero(Lee.nextInt());
n.imprime();
}
}