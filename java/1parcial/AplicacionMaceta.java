import java.util.*;
class AplicacionMaceta{
public static void main(String [] x){
Scanner Teclado = new Scanner(System.in);
Maceta macetax=new Maceta();
System.out.println("\t Programando en java");
System.out.print("\nQue tamano tiene la maceta en centimetros? : ");
macetax.setTamano(Teclado.nextFloat());
System.out.print("\n\n El tamano de la maceta es: ");
System.out .println(macetax.getTamano());


System.out.print("\nDee que material es la maceta? : ");
macetax.setMaterial(Teclado.next());
System.out.print("\n\n El Material de la maceta es : ");
System.out .println(macetax.getMaterial());
}
}