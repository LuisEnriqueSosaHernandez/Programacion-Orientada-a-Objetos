import java.util.*;
import java.lang.*;
class Calculodeconotruncado{
public static void main(String []arg){

double ge;
double areal;
double areat;
double vol;

Scanner Lee = new Scanner (System.in);


ConoTruncado con = new ConoTruncado();

System.out.print("Cuanto vale el radio menor: ");
	con.setR(Lee.nextDouble());

System.out.print("Cuanto vale el radio mayor: ");
	con.setRa(Lee.nextDouble());

System.out.print("Cuanto vale la altura: ");
	con.setH(Lee.nextDouble());


ge=con.CalculaGeneratriz();
System.out.println(" el valor de la generatriz es: " +ge);

areal=con.CalculaAreaLateral();
System.out.println(" el valor del area lateral es: " +areal);

areat=con.CalculaAreaTotal();
System.out.println(" el valor del area total es: " +areat);

vol=con.CalculaVolumen();
System.out.println(" el valor del volumen es: " +vol);
}
}



