import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		String s,x="";
		double b,y=0;
		for(int i=0;i<150;i++){
		System.out.println("Cual es el nombre del estudiante: "+(i+1));
		s=l.next();
		System.out.println("Cual es el promedio del estudiante: "+(i+1));
		b=l.nextDouble();
		if(b>y){
		y=b;
		x=s;
		}
		}
		System.out.println("nombre del estudiante con mejor promedio: "+x);
		System.out.println("Con un promedio de: "+y);
		}
		}