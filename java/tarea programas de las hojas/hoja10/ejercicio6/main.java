import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		System.out.println("Dame el valor final: ");
		int a=l.nextInt();
		System.out.println("Los multiplos de 5 son: ");
		for(int i=5;i<a;i++){
		if(i%5==0){
		System.out.print(i+" ");
		}
		}
}
}