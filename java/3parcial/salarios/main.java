import javax.swing.JOptionPane;
import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
Sindicalizado s = new Sindicalizado();
NoSindicalizado n = new NoSindicalizado();
int a;
	String r="";
do{
	System.out.println("1=Sindicalizado");
	System.out.println("2=NoSindicalizado");
	System.out.print("Que tipo de trabajador es: ");
	a=Lee.nextInt();
switch(a){
	case 1:
System.out.print("Cual es el nombre: ");
s.setNombre(Lee.next());
System.out.print("Cual es la edad: ");
s.setEdad(Lee.nextInt());
System.out.print("Cual es el sueldo: ");
s.setSueldo(Lee.nextDouble());
System.out.println("Su sueldo es: "+s.calculasueldo());
break;
case 2:
System.out.print("Cual es el nombre: ");
n.setNombre(Lee.next());
System.out.print("Cual es la edad: ");
n.setEdad(Lee.nextInt());
System.out.print("Cual es el sueldo: ");
n.setSueldo(Lee.nextDouble());
System.out.print("Cuantos tiempo lleva trabajando en años: ");
n.setAnos(Lee.nextInt());
System.out.println("Su sueldo es: "+n.calculasueldo());
break;
default:
System.out.println("Ese numero no esta contemplado");
}
System.out.println("Desea hacer otro calculo? : ");
r=Lee.next();
}
while(r.equals("si"));
JOptionPane.showMessageDialog(null,"Fin del programa");

}
}

