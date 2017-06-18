import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		double a,b,c;
		
		System.out.println("Ingresa valor para a: ");
		a=l.nextDouble();
		System.out.println("Ingresa valor para b: ");
		b=l.nextDouble();
		System.out.println("Ingresa valor para c: ");
		c=l.nextDouble();
		double x;
		x=Math.sqrt((b*b)-(4*(a*c)));
		x=b+x;
		x/=(2*a);
		System.out.println("El valor de la formula para cualquier valor de abc es: "+x);
		}
		}