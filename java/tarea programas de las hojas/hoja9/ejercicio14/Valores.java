public class Valores{
private int x=10;
private int y=5;
private int aux;
public void muestra(){
System.out.println("El valor de x: "+x);
System.out.println("El valor de y: "+y);
}
public void intercambia(){
aux=x;
x=y;
y=aux;
System.out.println("El valor de x ahora es: "+x);
System.out.println("El valor de y ahora es: "+y);
}
}