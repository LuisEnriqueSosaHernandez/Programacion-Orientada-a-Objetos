import java.util.Scanner;
public class Multiplo{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
Numero n=new Numero();
System.out.println("Ingresa un numero: ");
n.setNumero(Lee.nextInt());
System.out.println("Ingresa un numero para saber si es multiplo del primero: ");
n.setNumero2(Lee.nextInt());

if(n.numero%n.numero2==0){
System.out.println(n.numero+" Es multiplo de "+n.numero2);

}else{
System.out.println(n.numero+" No es multiplo de "+n.numero2);
}


}

}