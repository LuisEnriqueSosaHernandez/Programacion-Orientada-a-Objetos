import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		System.out.println("Dame el numero 1: ");
	int a=l.nextInt();
	System.out.println("Dame el numero 2: ");
	int b=l.nextInt();
	System.out.println("Dame el numero 3: ");
	int c=l.nextInt();
	if(a>b&&a>c){
	System.out.println("El numero mayor es: "+a);
	}
	if(b>a&&b>c){
	System.out.println("El numero mayor es: "+b);
	}
	if(c>a&&c>b){
	System.out.println("El numero mayor es: "+c);
	}
	
	
	
		
	}
	}