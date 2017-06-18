import java.util.*;
class UsaCircunferencia{
public static void main(String [] p){
	Double a;
	Scanner teclado = new Scanner (System.in);

	Circunferencia circulo = new Circunferencia();

	System.out.print("Cual es el valor de Pi: ");
	circulo.setPi(teclado.nextDouble());

	System.out.print ("Cual es el diametro de la circunferencia: ");
	circulo.setDiametro (teclado.nextFloat());

	a=circulo.CalculoArea();
	System.out.println ("El area de la circunferencia es: " + circulo.CalculoArea());

	System.out.println("El perimetro de la circunferencia es: " + circulo.CalculoPerimetro());
	}
}