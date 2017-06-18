import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		int r=0;
		double m;
		System.out.println("Introduce un numero: ");
		m=l.nextDouble();
		while(m>=0){
		System.out.println("Introduce un numero: ");
		if(m>=0){
		r++;
		}
		m=l.nextDouble();
		}
		System.out.println("El maximo de numeros positivos introducidos es: "+r);
		}
		}