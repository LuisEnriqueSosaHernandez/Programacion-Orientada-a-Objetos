import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		System.out.println("Ingrese cuantos alumnos hay: ");
		int a=l.nextInt();
		System.out.println("Ingrese cuantas alumnas hay: ");
		int b=l.nextInt();
		double alumno=0,alumna=0;
		for(int i=0;i<a;i++){
		 System.out.println("Ingrese altura para alumno: "+(i+1));
		 alumno+=l.nextDouble();
		}
		for(int i=0;i<b;i++){
		 System.out.println("Ingrese altura para alumna: "+(i+1));
		 alumna+=l.nextDouble();
		}
		System.out.println("El promedio de altura para alumnos es: "+(alumno/a));
		System.out.println("El promedio de altura para alumnas es: "+(alumna/b));
		}
		}