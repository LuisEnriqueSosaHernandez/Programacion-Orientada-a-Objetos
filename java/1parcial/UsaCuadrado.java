import java.util.*;
class UsaCuadrado{
public static void main(String [] arg){
	Double a;
	Scanner lee = new Scanner (System.in);

	Cuadrado cuadro = new Cuadrado();

	System.out.print ("Cuanto mide un lado del cuadrado: ");
	cuadro.setLado (lee.nextDouble());
	
	a= cuadro.CalculoArea();
	System.out.println("El area del cuadrado es: " + cuadro.CalculoArea());

	System.out.println("El perimetro del cuadrado es: " + cuadro.CalculoPerimetro());
	}
}