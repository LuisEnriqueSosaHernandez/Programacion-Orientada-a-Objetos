import java.util.Scanner;
public class Bancomain{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
banco b=new banco();

System.out.print("Ingresa la cantidad de dinero que invertiste: ");
b.setDinero(Lee.nextDouble());

System.out.print("Tu cantidad Invertida aumento ha (Refiriendo que si fue mayor a 20000 volveras a invertir: "+b.Calcula());



}

}