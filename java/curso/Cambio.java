import java.util.Scanner;
public class Cambio{
public static void main(String[]arg){
int a,b,c;
Scanner Lee = new Scanner(System.in);

System.out.print("Introduce el valor para a: ");

a=Lee.nextInt();

System.out.print("Introduce un valor para b: ");

b=Lee.nextInt();
c=a;

a=b;

System.out.println("El valor de a es:"+a);

b=c;

System.out.println("El valor de b es:"+b);

}

} 