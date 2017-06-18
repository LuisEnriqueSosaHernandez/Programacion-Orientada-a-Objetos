import java.util.Scanner;
public class Polimorfismo{
public static void main(String[]args){
Operaciones p=new Operaciones();
Scanner Lee=new Scanner(System.in);

System.out.println("Dame el valor del entero");
p.setA(Lee.nextInt());
System.out.println("Dame el valor del flotante");
p.setB(Lee.nextFloat());
System.out.println("Dame el valor del doble");
p.setC(Lee.nextDouble());
int a;
System.out.println("1=entero*2");
System.out.println("2=float*2");
System.out.println("3=doble*2");
System.out.println("4=doble*entero");
System.out.println("5=La multiplicacion de los tres");
System.out.println("Ingresa una opcion");
a=Lee.nextInt();

switch(a){
case 1:
System.out.println("El resultado es: "+p.Calculo(p.a));
break;
case 2:
System.out.println("El resultado es: "+p.Calculo(p.b));
break;
case 3:
System.out.println("El resultado es: "+p.Calculo(p.c));
break;
case 4:
System.out.println("El resultado es: "+p.Calculo(p.c,p.a));
break;
case 5:
System.out.println("El resultado es: "+p.Calculo(p.c,p.a,p.b));
break;
}
}

}