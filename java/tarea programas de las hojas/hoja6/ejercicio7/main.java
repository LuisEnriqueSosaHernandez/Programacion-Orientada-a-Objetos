import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		System.out.println("Dame el valor de a");
		int a=l.nextInt();
		System.out.println("Dame el valor de b");
		int b=l.nextInt();
		System.out.println("El valor de a es: "+a);
		System.out.println("El valor de b es: "+b);
		int aux=0;
		System.out.println("Metemos a en auxiliar");
		aux=a;
		System.out.println(aux);
		System.out.println("Metemos b en a");
		a=b;
		System.out.println(a);
		System.out.println("Metemos aux en b que era el valor de a");
		b=aux;
		System.out.println(b);
	}
}
		