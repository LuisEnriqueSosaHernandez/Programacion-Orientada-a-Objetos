import java.util.Scanner;
public class main{
	public static void main(String[]args){
Scanner l=new Scanner(System.in);
System.out.println("De que dimension quieres el arreglo: ");
int a=l.nextInt();
int[] x =new int[a];
int[] y =new int[a];
int[] r =new int[a];
System.out.println("Arreglo X");
for(int i=0;i<x.length;i++){
	x[i]=l.nextInt();
}
System.out.println("Arreglo Y");
for(int i=0;i<y.length;i++){
	y[i]=l.nextInt();
}
for(int i=0;i<x.length;i++){
	r[i]=x[i]+y[i];
}
System.out.println("Arreglo Resultante despues de sumar");
for(int i=0;i<r.length;i++){
	System.out.print(r[i]+" ");
}

	}
}