import java.util.Scanner;
public class Promedio{
public static void main(String[] args){
Scanner Lee = new Scanner(System.in);
Calificacion c = new Calificacion();
System.out.print("Ingresa tu primera calificacion: ");
c.setCalificacion1(Lee.nextFloat());
System.out.print("Ingresa tu primera calificacion: ");
c.setCalificacion2(Lee.nextFloat());
System.out.print("Ingresa tu primera calificacion: ");
c.setCalificacion3(Lee.nextFloat());

if(c.calculapromedio()>7){
	System.out.print("\nHas aprobado tio\n");
}	
else{
	System.out.print("\nVengo tio no seas filipollas ponte a estudiar \n");
}
	
}
}