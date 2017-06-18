import java.util.Scanner;
import javax.swing.JOptionPane;
public class main{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
Cuadrado c=new Cuadrado();
Rectangulo r=new Rectangulo();
Triangulo t=new Triangulo();
Circulo ci=new Circulo();
int a;
String s="";
JOptionPane.showMessageDialog(null,"Calculos de  Area y Perimetro de figuras geometricas");
do{
System.out.println("1=cuadrado");
System.out.println("2=rectangulo");
System.out.println("3=triangulo");
System.out.println("4=circulo");
System.out.print("Ingresa una opcion: ");
a=Lee.nextInt();

switch(a){
case 1:	
System.out.println("Dame el lado del cuadrado: ");
c.setLado(Lee.nextDouble());
System.out.println("El area es: "+c.calcularArea());
System.out.println("El perimetro es: "+c.calcularPerimetro());
break;
case 2:
System.out.println("Dame la base del rectangulo: ");
r.setBase(Lee.nextDouble());
System.out.println("Dame la altura: ");
r.setAltura(Lee.nextDouble());
System.out.println("El area es: "+r.calcularArea());
System.out.println("El perimetro es: "+r.calcularPerimetro());
break;
case 3:
System.out.println("Dame el lado1(base) del triangulo: ");
t.setLado1(Lee.nextDouble());
System.out.println("Dame el lado2(altura): ");
t.setLado2(Lee.nextDouble());
System.out.println("Dame el lado3: ");
t.setLado3(Lee.nextDouble());
System.out.println("El area es: "+t.calcularArea());
System.out.println("El perimetro es: "+t.calcularPerimetro());
break;
case 4:
System.out.println("Dame el radio del circulo: ");
ci.setRadio(Lee.nextDouble());
System.out.println("El area es: "+ci.calcularArea());
System.out.println("El perimetro es: "+ci.calcularPerimetro());
break;
}
System.out.print("Quieres hacer otro calculo?: ");
s=Lee.next();
}

while(s.equals("si"));
JOptionPane.showMessageDialog(null,"Fin del programa");
}



}