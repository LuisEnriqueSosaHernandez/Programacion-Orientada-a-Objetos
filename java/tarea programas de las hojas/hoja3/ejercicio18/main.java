import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
System.out.println("Primeramente debemos de saber cuando dinero tiene: ");
double a=l.nextDouble();
boolean x=true;
int b;
String s="si";

if(x){
	while(s.equals("si")){
do{
System.out.println("Realizar un deposito.....1");
System.out.println("Girar un cheque.....2");
System.out.println("Solicitar el saldo.....3");
System.out.println("Terminar el proceso.....4");
b=l.nextInt();
}while(b<1||b>4);
switch(b){

case 1:
System.out.println("Cuanto quieres depositar: ");
double d=l.nextDouble();
a+=d;
break;
case 2:
System.out.println("Cheque girado por : ");
double c=l.nextDouble();
if(a>c){
System.out.println("Cheque girado y cobrado con exito");
a-=c;
}
break;
case 3:
System.out.println("Tu saldo es de: $"+a);
break;
case 4:
x=false;
s="no";
break;
}
if(x){
System.out.println("Deseas hacer otra transaccion: ");
s=l.next();
}
}
}
}
}
