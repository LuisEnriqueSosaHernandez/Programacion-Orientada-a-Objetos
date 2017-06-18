import java.util.Scanner;
public class UsaMultiplicacion{
public static void main(String[]args){
Multiplicacion m = new Multiplicacion();
Scanner Lee=new Scanner(System.in);

System.out.print("Ingresa un numero para X: ");
m.setNumero1(Lee.nextInt());


System.out.print("Ingresa un numero para Y: ");
m.setNumero2(Lee.nextInt());

System.out.println("El resultado de la multiplicacion es: "+m.multiplicacion());

System.out.println("La multiplicacion de X*Y es igual a la suma de X,Y veces: ");

System.out.println("El resultado de la suma de X, Y veces es: "+m.suma());



}


}