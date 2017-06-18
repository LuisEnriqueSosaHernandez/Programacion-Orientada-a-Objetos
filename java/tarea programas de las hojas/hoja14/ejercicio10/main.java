import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		System.out.print("Cual es el monto? ");
		double monto=l.nextDouble();
		double empresa;
		double banco;
		double fabricante;
		double fabricante2;
		if(monto>500000){

         empresa=(monto*.55);
         banco=(monto*.30);
         fabricante=(monto*.15);
         fabricante2=(fabricante*.20);
         System.out.println("Lo que pagara la empresa: "+empresa);
         System.out.println("Lo que se le pedira al banco: "+banco);
         System.out.println("Lo que se le pedira al fabricante: "+fabricante);
         System.out.println("Lo que pagara al fabricante por concepto de interes: "+fabricante2);
		}
		else{
           empresa=(monto*.70);	
           fabricante=(monto*.30);
           fabricante2=(fabricante*.20);
           System.out.println("Lo que pagara la empresa: "+empresa);
         System.out.println("Lo que se le pedira al fabricante: "+fabricante);
         System.out.println("Lo que pagara al fabricante por concepto de interes: "+fabricante2);
		}


	}
}