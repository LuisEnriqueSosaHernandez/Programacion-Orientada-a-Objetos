import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
System.out.println("Cuantos alumnos tiene: ");
int a=l.nextInt();
double p=0;
double[] arreglo=new double[a];
for(int i=0;i<arreglo.length;i++){
System.out.println("Dame la altura del alumno: "+(i+1));
arreglo[i]=l.nextDouble();
}
for(int i=0;i<arreglo.length;i++){
p+=arreglo[i];
}
p/=a;
System.out.println(p);
for(int i=0;i<arreglo.length;i++){
	if(arreglo[i]<p){
System.out.println(arreglo[i]);
	}
}
}
}