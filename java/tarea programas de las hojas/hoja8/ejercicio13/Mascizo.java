import java.util.*;

public class Mascizo{
public static void main(String[]args){
Cilindro c=new Cilindro();
Scanner Lee=new Scanner(System.in);

//creo las variables que yo ocuparia en un solorenglon

double largo,ancho,altura,radio,volumen;
/*  tu codigo original
System.out.print("Ingresa el largo del rectangulo: ");
r.setLargo(Lee.nextDouble());
System.out.print("Ingresa el ancho del rectangulo: ");
r.setAncho(Lee.nextDouble());
System.out.print("Ingresa la altura del rectangulo: ");
r.setAltura(Lee.nextDouble());
System.out.print("El volumen del rectangulo es: "+r.Calculavolumen());
System.out.print("\nIngresa el radio del cilindro: ");
c.setRadio(Lee.nextDouble());
System.out.print("El volumen del cilindro es: "+c.Calculavolumencilindro());
}
*/

//COMO YO LO ARIA

System.out.print("Ingresa el largo del rectangulo: ");
largo=Lee.nextDouble();
System.out.print("Ingresa el ancho del rectangulo: ");
ancho=Lee.nextDouble();
System.out.print("Ingresa la altura del rectangulo: ");
altura=Lee.nextDouble();

/*AQUI CREO MI OBJETOO PERO YA LE ESTOY ASIGNANDO ALMISMO TIEMPO VALORES 
ESTO SELLAMA CONSTRUCTOR 
*/
Rectangulo r=new Rectangulo(largo,altura,ancho);

System.out.print("El volumen del rectangulo es: "+r.Calculavolumen());


System.out.print("\nIngresa el radio del cilindro: ");
radio=Lee.nextDouble();



/*EN ESTA PARTE DE AQUI ABAJO LE ENVIAMOS AL cilindro.java
EL RADIO Y EL LARGO
*/

c.setRadio(radio,largo);
/*
NOTA:como ves se pueden mandar varios valores en un solo set
*/
System.out.print("El volumen del cilindro es: "+c.Calculavolumencilindro());

volumen=r.Calculavolumen()-c.Calculavolumencilindro();
System.out.print("\nEl volumen Mascizo del rectangulo es: "+volumen);




}
}