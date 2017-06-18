import java.util.*;
class AplicacionPersona{
public static void main(String [] x){
Scanner Teclado = new Scanner(System.in);
Persona personax=new Persona();
System.out.println("\t Programa la edad de la persona");
System.out.print("\nQue edad tiene la persona? : ");
personax.setEdad(Teclado.nextInt());
System.out.print("\n\n La edad de la persona es : ");
System.out .println(personax.getEdad());
}
}