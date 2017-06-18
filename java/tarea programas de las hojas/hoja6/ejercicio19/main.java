import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
System.out.println("Dame el lado a: ");
int a=l.nextInt();
System.out.println("Dame el lado b: ");
int b=l.nextInt();
System.out.println("Dame el lado c: ");
int c=l.nextInt();

a=(int)Math.pow(a,2);

b=(int)Math.pow(b,2);

c=(int)Math.pow(c,2);

if((a+b)==c){
System.out.println("Es un triangulo equilatero");
}
else{
System.out.println("No es un triangulo rectangulo");	
}
}
}

