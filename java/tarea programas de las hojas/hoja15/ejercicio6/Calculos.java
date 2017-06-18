import java.util.Scanner;
public class Calculos{
	public static void main(String[]args){
Bienesraices b =new Bienesraices();
Scanner Lee=new Scanner(System.in);

System.out.print("Ingresa tus ingresos mensuales: ");
b.setIngresos(Lee.nextDouble());

System.out.print("Ingresa el costo de la casa: ");
b.setCosto(Lee.nextDouble());


System.out.print("El enganche que debes dar es: "+b.Calculaenganche());
System.out.print("\n Tus mensualidades seran de: "+b.Calculamensualidades());




	}
}
