import java.util.Scanner;
public class UsaCirculo{
public static void main(String[]arg){
Scanner Lee=new Scanner(System.in);
Circulo c=new Circulo();

System.out.print("Dame el valor del perimetro del circulo: ");
c.setPerimetro(Lee.nextDouble());

c.Calculo();

}
}