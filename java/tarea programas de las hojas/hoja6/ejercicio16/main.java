import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		System.out.println("Cuantos numeros quieres leer");
		int x=l.nextInt();
		int a=0,mayor=0,menor=0;
		for(int i=0;i<x;i++){
			System.out.println("Dame el valor: "+(i+1));
			a=l.nextInt();
		if(a>mayor){
		mayor=a;
		}
		if(i==0){
		menor=a;
		}
		if(a<menor){
		menor=a;
		}
		}
		System.out.println("El numero mayor es: "+mayor);
		System.out.println("El numero menor es: "+menor);
		
}
}