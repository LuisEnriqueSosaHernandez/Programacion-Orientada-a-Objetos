import java.util.Scanner;
public class UsaNumero{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
Numero n = new Numero();

System.out.print("Ingresa el numero para calcular si es par o impar: ");
n.setNum(Lee.nextInt());
n.Calculaparoimpar();

}
}