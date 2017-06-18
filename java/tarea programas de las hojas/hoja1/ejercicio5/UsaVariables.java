import java.util.Scanner;
public class UsaVariables{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
Variables v=new Variables();
System.out.print("Ingresa un valor para a: ");
v.setA(Lee.nextDouble());
System.out.print("Ingresa un valor para b: ");
v.setB(Lee.nextDouble());
System.out.print("Ingresa un valor para c: ");
v.setC(Lee.nextDouble());
System.out.print("Ingresa un valor para d: ");
v.setD(Lee.nextDouble());

v.Producto();
v.Suma();
v.MediaAritmetica();



}
}