import javax.swing.JOptionPane;
import java.util.Scanner;
class Calculos{
public static void main (String[]args){
Scanner Lee= new Scanner(System.in);
int a;
String s="";
do{
Rectangulo r=new Rectangulo();
Trapecio t=new Trapecio();
Cuadrado c=new Cuadrado();
Triangulo tri=new Triangulo();
JOptionPane.showMessageDialog(null,"Calculos de  Area y Perimetro de figuras geometricas");
System.out.println("1 = Rectangulo");
System.out.println("2 = Trapecio");
System.out.println("3 = Cuadrado");
System.out.println("4 = Triangulo");
do{
System.out.print("Ingresa una opcion: ");
a=Lee.nextInt();
}while(a>4||a==0||a<0);

switch(a){
case 1:
System.out.print("\n");
System.out.print("Dame el valor del Lado1: ");
r.setLado1(Lee.nextFloat());
System.out.print("\n");
System.out.print("Dame el valor del Lado2: ");
r.setLado2(Lee.nextFloat());
System.out.print("\n");
System.out.println("El perimetro es: "+r.Perimetrorectangulo());
System.out.println("El area es: "+r.Arearectangulo());
break;
case 2:
System.out.print("\n");
System.out.print("Dame el valor de la base mayor: ");
t.setLado1(Lee.nextFloat());
System.out.print("\n");
System.out.print("Dame el valor de la base menor: ");
t.setLado2(Lee.nextFloat());
System.out.print("\n");
System.out.print("Dame el valor del Lado3: ");
t.setLado3(Lee.nextFloat());
System.out.print("\n");
System.out.print("Dame el valor del Lado4: ");
t.setLado4(Lee.nextFloat());
System.out.print("\n");
System.out.print("Dame el valor de la altura: ");
t.setAltura(Lee.nextFloat());
System.out.print("\n");
System.out.println("El perimetro es: "+t.Perimetrotrapecio());
System.out.println("El area es: "+t.Areatrapecio());
break;
case 3:
System.out.print("\n");
System.out.print("Dame el valor del Lado1: ");
c.setLado1(Lee.nextFloat());
System.out.print("\n");
System.out.println("El perimetro es: "+c.Perimetrocuadrado());
System.out.println("El area es: "+c.Areacuadrado());
break;
case 4:
System.out.print("\n");
System.out.print("Dame el valor de la base: ");
tri.setLado1(Lee.nextFloat());
System.out.print("\n");
System.out.print("Dame el valor de un lado: ");
tri.setLado2(Lee.nextFloat());
System.out.print("\n");
System.out.print("Dame el valor del otro lado: ");
tri.setLado3(Lee.nextFloat());
System.out.print("\n");
System.out.print("Dame el valor de la altura: ");
tri.setAltura(Lee.nextFloat());
System.out.print("\n");
System.out.println("El perimetro es: "+tri.Perimetrotriangulo());
System.out.println("El area es: "+tri.Areatriangulo());
break;
}

System.out.println("Quieres hacer otro calculo: ");
s=Lee.next();
}
while(s.equals("si"));
//fflush();

}
}