import java.util.*;
class HaceCalcAreaTrianguloI{
public static void main(String [] arg){

Double a;
Double b;

Scanner Lee = new Scanner (System.in);

TrianguloI tri= new TrianguloI ();

System.out.println("Cual es la base: ");
	tri.setBase(Lee.nextInt());

System.out.println("Cual es la altura: ");
	tri.setAltura(Lee.nextInt());


System.out.println("Cual es el lado 1: ");
	tri.setLado1(Lee.nextInt());

System.out.println("Cual es el lado 2: ");
	tri.setLado2(Lee.nextInt());



a = tri.CalculoAreaCirculo();

b = tri.CalculoAreaCirculo2();

System.out.println("El area es : " +a);
System.out.println("El perimetro  es : " +b);

}
}