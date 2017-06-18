import java.util.Scanner;
public class main{

public static void main(String[]args){
Scanner l=new Scanner(System.in);
System.out.println("De que dimension quiere su arreglo: ");
int a=l.nextInt();
double[]arreglo=new double[a];
for(int i=0;i<arreglo.length;i++){
System.out.println("Dame el valor para la posicion "+(i+1));
	arreglo[i]=l.nextDouble();
}	
System.out.println("El arreglo");
for(int i=0;i<arreglo.length;i++){
System.out.print(arreglo[i]+" ");
}
System.out.println("");
System.out.print("La media aritmetica es: ");
double media=0;
for(int i=0;i<arreglo.length;i++){
media+=arreglo[i];
}	
media=media/a;
System.out.print(media);
}
}

