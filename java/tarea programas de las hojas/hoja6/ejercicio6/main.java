import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		double a;
		int b;
		System.out.println("Ingresa un numero real: ");
		a=l.nextFloat();
	    b=(int)a;
		double x=a-b;
		System.out.println("Parte Entera: ");
		System.out.println(b);
		System.out.println("Parte Fraccionaria: ");
		System.out.println(x);

		}
		}