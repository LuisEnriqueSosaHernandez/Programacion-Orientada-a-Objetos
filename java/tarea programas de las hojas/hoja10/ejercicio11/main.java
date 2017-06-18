import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		System.out.println("El valor de n es: ");
		int n=l.nextInt();
		double sumatoria1=0;
		double sumatoria2=0;
		double sumatoria3=0;
for(int j=0;j<(n-1);j++){
				
		sumatoria3+=sumatoria2;
		for(int i=0;i<=n;i++){

			sumatoria1+=(1/n);
			sumatoria2+=(i*sumatoria1);
			sumatoria2=1+sumatoria2;



		}
	}
System.out.println(sumatoria3);
	}
}