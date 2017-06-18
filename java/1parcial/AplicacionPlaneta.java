import java.util.*;
class AplicacionPlaneta{
public static void main(String [] x){
Scanner Teclado = new Scanner(System.in);
Planeta planetax=new Planeta();
System.out.println("\t Programa Distancia a un planeta");
System.out.print("Cual es la distanca de la tierra a jupiter:");
planetax.setDistancia(Teclado.nextDouble());
System.out.print("\n\n La distancia de tierra a jupiter es:");
System.out .println(planetax.getDistancia());
}
}

