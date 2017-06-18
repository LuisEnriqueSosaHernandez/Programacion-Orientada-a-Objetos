import java.util.Scanner;
public class main{
	public static void main(String[]args){
Scanner l=new Scanner(System.in);
System.out.println("De que dimension quieres el arreglo: ");
int a=l.nextInt();
double[] x =new double[a];
double[] y =new double[a];
double[] r =new double[a];
System.out.println("Arreglo X");
for(int i=0;i<x.length;i++){
	x[i]=l.nextInt();
}
System.out.println("Arreglo Y");
for(int i=0;i<y.length;i++){
	y[i]=l.nextInt();
}
System.out.println("Que accion desea realizar: ");
System.out.println("para sumar pulse 1 ");
System.out.println("para restar pulse 2");
int b=l.nextInt();
switch(b){
	case 1:
for(int i=0;i<x.length;i++){
	r[i]=x[i]+y[i];
}
System.out.println("Arreglo Resultante despues de sumar");
for(int i=0;i<r.length;i++){
	System.out.print(r[i]+" ");
}
break;
case 2:

for(int i=0;i<x.length;i++){
	r[i]=x[i]-y[i];
}
System.out.println("Arreglo Resultante despues de restar");
for(int i=0;i<r.length;i++){
	System.out.print(r[i]+" ");
}
	
	break;
}
}
}