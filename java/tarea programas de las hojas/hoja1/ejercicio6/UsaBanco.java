import java.util.Scanner;
public class UsaBanco{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
Banco b=new Banco();

System.out.print("Ingresa la cantidad que te presto el banco: ");
b.setBanco(Lee.nextDouble());

b.CalculaInteres();

}
}