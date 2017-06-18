import java.util.Scanner;
public class Anidados{
public static void main(String[]arg){
double temp;
Scanner Lee = new Scanner(System.in);

System.out.print("Introduce una temperatura: ");
temp=Lee.nextDouble();

if(temp>30){

System.out.println("Hace calor.");
}
else if(temp>25){
System.out.println("La temperatura es normal.25");
}
else if(temp>20){
System.out.println("La temperatura es normal.20");
}
else if(temp>15){
System.out.println("La temperatura es normal.15");
}
else{
System.out.println("Hace frio.");
}
System.out.println("Estoy fuera");
}
}