import java.util.Scanner;
import java.util.Random;
public class main{
public static void main(String[]args){
Random  rnd = new Random();
Scanner l=new Scanner(System.in);
int a=(int)(Math.random()*20 + 0);
System.out.println("Ingresa un numero: ");
int b=l.nextInt();
while(a!=b){
	if(a>b){
		System.out.println("Tu numero es menor ");
	}
	else{
		System.out.println("Tu numero es mayor");
	}
	System.out.println("Ingresa un numero: ");
	b=l.nextInt();
}
System.out.println("Has adivinado el numero");
}
}
