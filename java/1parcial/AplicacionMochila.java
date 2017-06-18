import java.util.*;
class AplicacionMochila{
public static void main(String [] x){
Scanner Teclado = new Scanner(System.in);
Mochila mochilax=new Mochila();
System.out.println("\t Programa la marca de la mochila");
System.out.print("\nQue marca es la mochila? : ");
mochilax.setMarca(Teclado.next());
System.out.print("\n\n La marca de la mochila es: ");
System.out .println(mochilax.getMarca());
}
}