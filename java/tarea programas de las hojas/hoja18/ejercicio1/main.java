import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
Fabrica f=new Fabrica();
System.out.println("Cuantas computadoras fueron compradas: ");
f.setCantidad(l.nextInt());
System.out.println("El total a pagar es de: "+f.retorno());
}
}