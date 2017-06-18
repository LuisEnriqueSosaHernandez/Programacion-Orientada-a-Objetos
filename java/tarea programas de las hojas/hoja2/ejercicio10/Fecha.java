import java.util.Scanner;
public class Fecha{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
int ano;
int mes;
int dia;
System.out.println("Cual es el año? ");
ano=l.nextInt();
System.out.println("Cual es el mes? ");
mes=l.nextInt();
System.out.println("Cual es el dia? ");
dia=l.nextInt();
if(mes==2&&ano>0&& dia>0 && dia<29){
	System.out.println("La fecha es : "+dia+"-"+mes+"-"+ano);
}
if(mes!=2 &&ano>0 && mes>0 && mes<13 && dia>0 && dia<32){
		System.out.println("La fecha es : "+dia+"-"+mes+"-"+ano);
}else{
System.out.println("La fecha es incorrecta ");	
}
}
}
