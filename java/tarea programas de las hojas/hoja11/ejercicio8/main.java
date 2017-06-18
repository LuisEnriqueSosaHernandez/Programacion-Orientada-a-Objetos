import java.util.Scanner;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
		System.out.println("Dame los dos datos minutos y segundos separados por un espacio: ");
 double a=l.nextDouble();
	double b=l.nextDouble();
	while(a!=0&&b!=0){

	a*=60;
	double t=a+b;
	double v=1500/t;
	System.out.println("Tu velocidad es de: "+v+" m/s");
		System.out.println("Dame los dos datos minutos y segundos separados por un espacio: ");
	a=l.nextDouble();
	b=l.nextDouble();
	
}
}
}
