import java.util.*;
class Usatablademultiplicar{
public static void main(String []arg){

Scanner Lee = new Scanner (System.in);

Tablademultiplicar ta=new Tablademultiplicar();

System.out.print("Cual es la tabla que deseas saber: ");
	ta.setNum(Lee.nextInt());

System.out.print("\n");

ta.Calculatabla();
}
}
