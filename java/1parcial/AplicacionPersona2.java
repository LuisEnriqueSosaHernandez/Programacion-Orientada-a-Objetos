import java.util.*;
class AplicacionPersona2{
public static void main(String [] z){
Scanner Teclado = new Scanner(System.in);
Persona2 personaz = new Persona2();
System.out.println("\n");
System.out.println("\t Programando en java");

System.out.print("\nQue edad tiene el profe ? : ");
personaz.setEdad(Teclado.nextInt());
System.out.print("\nCual es su nombre? : ");
personaz.setNombre(Teclado.next());
System.out.print("\nQue Materia imparte? : ");
personaz.setMateria(Teclado.next());
System.out.println("\n");
System.out.println("\t Resultados");
System.out.print("\n\n la edad del profe es : ");
System.out .println(personaz.getEdad());



System.out.print("\n\n El nombre del profe es : ");
System.out .println(personaz.getNombre());
System.out.print("\n\n La Materia que imparte es : ");
System.out .println(personaz.getMateria());
System.out.println("\n");

System.out.println("\t Tu profe favorito");
System.out.print("\nQue edad tiene tu profe favorito ? : ");
personaz.setEdad(Teclado.nextInt());
System.out.print("\nCual es su nombre? : ");
personaz.setNombre(Teclado.next());
System.out.print("\nQue Materia imparte? : ");
personaz.setMateria(Teclado.next());

System.out.println("\n");

System.out.println("\t Resultados");
System.out.print("\n\n la edad del profe es : ");
System.out .println(personaz.getEdad());
System.out.print("\n\n El nombre del profe es : ");
System.out .println(personaz.getNombre());
System.out.print("\n\n La Materia que imparte es : ");
System.out .println(personaz.getMateria());
}
}

