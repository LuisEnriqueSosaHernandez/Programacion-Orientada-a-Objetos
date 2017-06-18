import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
llantas ll=new llantas();
  System.out.println("Cuantas llantas compraste");
  ll.setCantidad(l.nextInt());
 
  System.out.println("El precio total es: "+ll.total());
  

}
}