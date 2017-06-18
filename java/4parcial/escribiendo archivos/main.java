import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
escribiendo es=new escribiendo();
System.out.println("Dame tu nombre: ");
es.setA(l.nextLine());
System.out.println("Dame tu numero de control: ");
es.setB(l.nextLine());
es.escribir();
}
}
