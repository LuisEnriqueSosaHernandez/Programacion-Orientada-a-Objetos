import java.util.*;
class AplicacionPared{
public static void main(String [] x){
Scanner Teclado = new Scanner(System.in);
Pared paredx=new Pared();
System.out.println("\t Programa el color de la pared");
System.out.print("\nQue color es la pared? :");
paredx.setColor(Teclado.next());
System.out.print("\n\n El color de la pared es : ");
System.out .println(paredx.getColor());
}
}