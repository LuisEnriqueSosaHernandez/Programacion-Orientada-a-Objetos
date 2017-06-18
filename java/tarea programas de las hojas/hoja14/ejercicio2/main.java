import java.util.Random;
import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
Random rnd=new Random();
int a=(int)(rnd.nextDouble() * 100 + 0);
System.out.println("De cuanto es tu compra");
double x=l.nextDouble();
System.out.println("Tu numero es: "+a);
if(a>=74){
x=x-(x*.15);
System.out.println("El costo es de: "+x);
}
if(a<74){
x=x-(x*.10);
System.out.println("El costo es de: "+x);

}

	}
}