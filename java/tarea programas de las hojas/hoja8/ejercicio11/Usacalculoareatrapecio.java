import java.util.*;
class Usacalculoareatrapecio{
public static void main(String []arg){

Double a;
Double ma;
Double me;
Double pe;

Scanner Lee = new Scanner (System.in);

Trapecio tra=new Trapecio ();

System.out.print("Cuanto vale el lado a: ");
	tra.setLadoa(Lee.nextDouble());

System.out.print("Cuanto vale el lado b: ");
	tra.setLadob(Lee.nextDouble());

System.out.print("Cuanto vale el lado c: ");
	tra.setLadoc(Lee.nextDouble());

ma=tra.Calculabasemayor();
System.out.println("La base mayor es : " +ma);

me=tra.Calculabasemenor();
System.out.println("La base menor es : " +me);

a=tra.Calculaarea();
System.out.println("El area es : " +a);
pe=tra.Calculaperimetro();
System.out.println("El perimetro es : " +pe);
}
}

