import java.util.Scanner;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
	System.out.print("Dame la clave: ");
	int clave=l.nextInt();
	System.out.print("Dame el nombre: ");
	String nombre=l.next();
	System.out.print("Dame el precio: ");
	double precio=l.nextDouble();
	if(clave==1){
	System.out.println(nombre);
	System.out.println("La clave es: "+clave);
	System.out.println("El precio es: "+precio);
	precio=precio-(precio*.10);
	System.out.println("El precio con descuento es: "+precio);
	
	}
	if(clave==2){
	System.out.println(nombre);
	System.out.println("La clave es: "+clave);
	System.out.println("El precio es: "+precio);
	precio=precio-(precio*.20);
	System.out.println("El precio con descuento es: "+precio);
	
	}
	}
	}