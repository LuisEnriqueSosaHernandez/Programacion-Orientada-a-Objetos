import java.util.Scanner;
public class mayor{
public static void main(String[]arg){
Scanner Lee=new Scanner(System.in);
int numx;
int mayor=0;

for (int i=1; i<=4; i++)
{
 System.out.print("\n\n\tIngrese numero: "+i+" ");
 numx=Lee.nextInt();
 if (numx > mayor)
 {
  mayor = numx;
 }
}
System.out.print("El numero mayor es: "+mayor);
}
}