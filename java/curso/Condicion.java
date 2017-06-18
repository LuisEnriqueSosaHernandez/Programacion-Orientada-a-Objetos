import java.util.Scanner;
public class Condicion{
public static void main(String[]arg){
int x;
Scanner Lee =new Scanner(System.in);
System.out.print("Introduce un valor: ");
x= Lee.nextInt();
if(x>0 && x<10){
System.out.println("El numero se encuentra entre 0 y 10 ");

}
else{
System.out.println("El numero no se encuentra entre 0 y 10");
}


}
}