
import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		System.out.println("Duracion dela llamada en minutos: ");
		int a=l.nextInt();
		double precio=0;
		for(int i=1;i<=a;i++){
			if(i<=3){
             precio+=(10*i);
			}
			if(i>3){
				precio+=(5*i);
			}
		}
		System.out.println("El preciode la llamada es: "+precio+" PIAS");
	}
}