import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		System.out.println("Hasta que numero quieres averiguar los pares positivos: ");
		int a=l.nextInt();
		System.out.println("Los numeros pares positivos en este rango son: ");
		for(int i=0;i<a;i++){
		if(i%2==0){
		System.out.print(i+" ");
		}
		}
		
}
}