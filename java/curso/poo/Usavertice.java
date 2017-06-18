import java.util.Random;
public class Usavertice{
public static void main(String[]arg){
int aux1,aux2;
Random rand=new Random(System.nanoTime());

aux1=rand.nextInt(10);
aux2=rand.nextInt(10);
Vertice a=new Vertice(5,25);

aux1=rand.nextInt(10);
aux2=rand.nextInt(10);
Vertice b=new Vertice(aux1,aux2);

aux1=rand.nextInt(10);
aux2=rand.nextInt(10);
Vertice c=new Vertice(aux1,aux2);
Triangulo2 t1=new Triangulo2(a,b,c); 

Vertice temp=t1.getA();

System.out.println("El valor de x del objeto temp es: " +temp.getX()+" e y es: "+temp.getY()); 
 
temp.setX(20);
temp.setY(32);

System.out.println("El valor de x del objeto temp es: " +a.getX()+" e y es: "+a.getY()); 

}


}