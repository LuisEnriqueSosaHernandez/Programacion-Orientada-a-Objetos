import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		System.out.print("Cuantas llantas compro? ");
		int llantas=l.nextInt();
		if(llantas<5&&llantas>0){
         llantas*=800;
         System.out.println("El precio es de: "+llantas);
		}
		if(llantas>=5){
         llantas*=700;
         System.out.println("El precio es de: "+llantas);
		}
	}
}