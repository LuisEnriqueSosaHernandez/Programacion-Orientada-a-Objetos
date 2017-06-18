import java.util.Scanner;
public class Multiplo{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
Numero n=new Numero();
System.out.println("Ingresa un numero: ");
n.setNumero(Lee.nextInt());

if(n.numero%3==0){
System.out.println(n.numero+" Es multiplo de 3");

}else{
System.out.println(n.numero+" No es multiplo de 3");
}


}

}