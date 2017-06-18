import javax.swing.JOptionPane;
import java.util.Scanner;
public class UsaComputador{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
Compuescritorio ce = new Compuescritorio();
Laptop l=new Laptop();
Tablet t=new Tablet();
int a;
String s="";
JOptionPane.showMessageDialog(null,"Tipos de computadoras");

do{
	do{
System.out.println("1 = Compuescritorio");
System.out.println("2 = Laptop");
System.out.println("3 = Tablet");
System.out.println("4 = Todos");

System.out.print("Ingresa una opcion: ");
a=Lee.nextInt();
}while(a>=5||a==0||a<0);

switch(a){
	case 1:
System.out.println("1 = Compuescritorio");
System.out.print("Cual es tu sistema Operativo: ");
ce.setSO(Lee.next());

System.out.print("Cual es la capacidad de tu disco duro: ");
ce.setGB(Lee.next());

System.out.print("Cual es tu procesador: ");
ce.setProcesador(Lee.next());

System.out.print("Cual es tu memoria de Pantalla: ");
ce.setKbmonitor(Lee.next());
System.out.print("\n");
ce.Imprimehijo();
break;

case 2:
System.out.println("2 = Laptop");

System.out.print("Cual es tu sistema Operativo: ");
l.setSO(Lee.next());

System.out.print("Cual es la capacidad de tu disco duro: ");
l.setGB(Lee.next());

System.out.print("Cual es tu procesador: ");
l.setProcesador(Lee.next());

System.out.print("Cual es tu tamano de pantalla: ");
l.setTP(Lee.next());

System.out.print("Cual es el peso en kg: ");
l.setKg(Lee.next());

System.out.print("Cual es tu tipo de lector: ");
l.setDisco(Lee.next());
System.out.print("\n");
l.Imprimenieto();
break;

case 3:

System.out.println("3 = Tablet");

System.out.print("Cual es tu sistema Operativo: ");
t.setSO(Lee.next());

System.out.print("Cual es la capacidad de tu disco duro: ");
t.setGB(Lee.next());

System.out.print("Cual es tu procesador: ");
t.setProcesador(Lee.next());

System.out.print("Cual es tu tamano de pantalla: ");
t.setTP(Lee.next());

System.out.print("Cual es el peso en kg: ");
t.setKg(Lee.next());

System.out.print("De cuantos pixeles es tu camara: ");
t.setPixeles(Lee.next());
System.out.print("\n");
t.Imprimenieta();

break;

case 4:
System.out.println("TODOS");

System.out.println("Compuescritorio");
System.out.print("Cual es tu sistema Operativo: ");
ce.setSO(Lee.next());

System.out.print("Cual es la capacidad de tu disco duro: ");
ce.setGB(Lee.next());

System.out.print("Cual es tu procesador: ");
ce.setProcesador(Lee.next());

System.out.print("Cual es tu memoria de Pantalla: ");
ce.setKbmonitor(Lee.next());
System.out.print("\n");
ce.Imprimehijo();


System.out.print("\n");

System.out.println("Laptop");

System.out.print("Cual es tu sistema Operativo: ");
l.setSO(Lee.next());

System.out.print("Cual es la capacidad de tu disco duro: ");
l.setGB(Lee.next());

System.out.print("Cual es tu procesador: ");
l.setProcesador(Lee.next());

System.out.print("Cual es tu tamano de pantalla: ");
l.setTP(Lee.next());

System.out.print("Cual es el peso en kg: ");
l.setKg(Lee.next());

System.out.print("Cual es tu tipo de lector: ");
l.setDisco(Lee.next());
System.out.print("\n");
l.Imprimenieto();

System.out.print("\n");

System.out.println("Tablet");

System.out.print("Cual es tu sistema Operativo: ");
t.setSO(Lee.next());

System.out.print("Cual es la capacidad de tu disco duro: ");
t.setGB(Lee.next());

System.out.print("Cual es tu procesador: ");
t.setProcesador(Lee.next());

System.out.print("Cual es tu tamano de pantalla: ");
t.setTP(Lee.next());

System.out.print("Cual es el peso en kg: ");
t.setKg(Lee.next());

System.out.print("De cuantos pixeles es tu camara: ");
t.setPixeles(Lee.next());
System.out.print("\n");
t.Imprimenieta();
break;
}

System.out.println("\n");
System.out.print("Quieres hacer otro calculo: ");
s=Lee.next();

}
while(s.equals("si"));





}
}