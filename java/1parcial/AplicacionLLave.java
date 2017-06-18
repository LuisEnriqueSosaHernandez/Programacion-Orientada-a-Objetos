import java.util.*;
class AplicacionLlave{
public static void main(String [] x){
Scanner Teclado = new Scanner(System.in);
Llave llavex=new Llave();
System.out.println("\t Programando en java");
System.out.print("\nQue Id tiene la llave? : ");
llavex.setIdentificador(Teclado.next());
System.out.print("\n\n El id de la llave es : ");
System.out .println(llavex.getIdentificador());


System.out.print("\nQue abre la llave? : ");
llavex.setAplicacion(Teclado.next());
System.out.print("\n\n Lo que abre la llave es : ");
System.out .println(llavex.getAplicacion());
}
}