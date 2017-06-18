import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		int a=0;
		System.out.println("Cuantos datos quieres sumar: ");
		int b=l.nextInt();
		for(int i=0;i<b;i++){
		System.out.println("Dame los valores");
		a+=l.nextInt();
		}
	
		System.out.println("La suma de los datos es: "+a);
		}
}