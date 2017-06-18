import java.util.Scanner;
public class UsaTabla{


public static void main(String[]arg){
Scanner Lee=new Scanner(System.in);
Tabla t=new Tabla();
System.out.print("Que numero de tabla desea imprimir: ");
t.setNt(Lee.nextInt());

t.Multiplica();



}
}