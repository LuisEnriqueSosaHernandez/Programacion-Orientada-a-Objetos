import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
System.out.println("Cuantos datos quiere: ");
int a=l.nextInt();
double[] arreglo=new double[a];
for(int i=0;i<arreglo.length;i++){
System.out.println("Dame el dato: "+(i+1));
arreglo[i]=l.nextDouble();
}
for(int i=0;i<arreglo.length;i++){
System.out.println(arreglo[i]);
	}
}
}
