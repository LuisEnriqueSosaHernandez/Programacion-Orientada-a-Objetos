import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		System.out.println("De que numero quieres empezar a averiguar los impares positivos: ");
		int b=l.nextInt();
		System.out.println("Hasta que numero quieres averiguar los impares positivos: ");
		int a=l.nextInt();
		System.out.println("Los numeros impares positivos en este rango son: ");
		for(int i=b;i<a;i++){
		if(i%2!=0){
		System.out.print(i+" ");
		}
		}
		
}
}