import java.util.Scanner;
public class Ahuevo{
public static void main(String[]arg){
Scanner Lee=new Scanner(System.in);
int a,b;
System.out.print("Introduce un numero: ");
a=Lee.nextInt();




do{
System.out.print("Introduce un numero mayor: ");
b=Lee.nextInt();
}while(b<a);


}


}
