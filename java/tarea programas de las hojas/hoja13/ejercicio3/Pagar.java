import java.util.Scanner;
public class Pagar{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
Dinero d = new Dinero();
System.out.print("Cuanto es el total de la compra?: ");
d.setCompra(Lee.nextDouble());
System.out.print("El total a pagar es "+d.total());
}
}