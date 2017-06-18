import java.util.*;
class AplicacionEstudiante{
public static void main(String [] x){
Scanner Teclado = new Scanner(System.in);
Estudiante estudiantex=new Estudiante();
System.out.println("\t Programa el promedio del estudiante");
System.out.print("\nQue promedio tiene el estudiante? :");
estudiantex.setPromedio(Teclado.nextFloat());
System.out.print("\n\n El promedio del estudiante es: ");
System.out .println(estudiantex.getPromedio());
}
}