import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		int a=0;
		System.out.println("Cuantos datos quieres ingresar: ");
		int b=l.nextInt();
		int x=0,y=0,z=0;
		for(int i=0;i<b;i++){
		System.out.println("Dame los valores");
		a=l.nextInt();
		z+=a;
		if(a>=0){
		x+=a;
		}
		else{
		y-=a;
		}
		}
		System.out.println("La Media aritmetica de los datos positivos es: "+(x/b));
	     System.out.println("La Media aritmetica de los datos negativos es: "+(y/b));
		System.out.println("La Media aritmetica de los datos es: "+(z/b));
		}
}