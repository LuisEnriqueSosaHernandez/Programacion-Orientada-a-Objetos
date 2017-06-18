import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
System.out.print("Cuantas camisas compraron: ");
int a=l.nextInt();
double[] arreglo=new double[a];
double precio=0;
for(int i=0;i<arreglo.length;i++){
System.out.println("Precio de la camisa "+(i+1));
arreglo[i]=l.nextDouble();
precio+=arreglo[i];
}
if(a>=3){
precio=precio-(precio*.20);
System.out.println("El precio de las camisa con un 20% es de: "+precio);
}
if(a<3){
precio=precio-(precio*.10);
System.out.println("El precio de las camisa con un 10% es de: "+precio);
}
}
}