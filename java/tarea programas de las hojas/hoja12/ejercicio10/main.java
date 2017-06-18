import java.util.Scanner;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
	double x;
	System.out.println("Dame la base: ");
	double a=l.nextDouble();
	System.out.println("Dame la altura: ");
	double b=l.nextDouble();
	x=(a*b)*(0.5);
	
	System.out.println("La superficie es: "+x);
	
	
	}
	}