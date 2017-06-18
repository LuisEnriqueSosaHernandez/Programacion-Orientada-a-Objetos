import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		System.out.println("Ingresa el capital: ");
		double capital=l.nextDouble();
		System.out.println("Ingresa el interes en porcentaje ejemplo .16 : ");
		double porcentaje=l.nextDouble();

       System.out.println("A cuantos años quieres hacer el calculo: ");
		double anos=l.nextDouble();

		for(int i=0;i<anos;i++){
         capital+=(capital*porcentaje);

		}
		System.out.println("Tu capital ascendera a: "+capital);
	}
}