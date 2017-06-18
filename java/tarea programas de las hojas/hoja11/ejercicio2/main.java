import java.util.Scanner;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
System.out.print("Horas trabajadas en la semana: ");
double c=0;
double aux;
int a=l.nextInt();
System.out.print("Precio de la hora: ");
double b=l.nextDouble();
if(a<=35){
c=a*b;
}
if(a>35){
c=b*35;
a-=35;
b=b+(b/2);
aux=a*b;
c=c+aux;
System.out.println(c);
}
if(c<20){
	System.out.println("Tu sueldo es: "+c);
}
if(c>=25&&c<30){
	c=c-(c*.20);
	System.out.println("Tu sueldo es: "+c);
}
if(c>30)
{
	c=c-(c*.30);
	System.out.println("Tu sueldo es: "+c);
}


}

}