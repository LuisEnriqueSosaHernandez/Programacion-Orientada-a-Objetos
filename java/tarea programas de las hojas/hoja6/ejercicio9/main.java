import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		int a=0;
		System.out.println("Cuantos datos quieres ingresar: ");
		int b=l.nextInt();
		for(int i=0;i<b;i++){
		System.out.println("Dame los valores");
		a+=l.nextInt();
		}
	
		System.out.println("La Media aritmetica de los datos es: "+(a/b));
		}
}