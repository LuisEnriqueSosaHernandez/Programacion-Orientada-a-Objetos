import java.util.Scanner;
class UsaHerencia{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
int a;
Papa papa = new Papa();
Mama mama =new Mama();
Hijo hijo =new Hijo();

System.out.print("Introduce un numero 1=papa 2=mama 3=hijo: ");
a=Lee.nextInt();


switch(a){

case 1:
System.out.println("Ingresa el nombre del papa: ");
papa.setNombre(Lee.next());

System.out.println("Ingresa la edad del papa: ");
papa.setEdad(Lee.nextInt());

System.out.println("Ingresa el sexo del papa: ");
papa.setSexo(Lee.next());

System.out.println("Ingresa la profesion del papa: ");
papa.setProfesion(Lee.next());

System.out.println("Ingresa el lugar del trabajo: ");
papa.setLugardetrabajo(Lee.next());

System.out.println("\n");

System.out.println("El nombre del papa es: "+papa.nombre);
System.out.println("La edad del papa es: "+papa.edad);
System.out.println("El sexo del papa es: "+papa.sexo);
System.out.println("La profesion del papa es: "+papa.profesion);
System.out.println("El lugar del trabajo del papa es: "+papa.lugardetrabajo);

break;


case 2:
System.out.println("Ingresa el nombre de la mama: ");
mama.setNombre(Lee.next());

System.out.println("Ingresa la edad de la mama: ");
mama.setEdad(Lee.nextInt());

System.out.println("Ingresa el sexo de la mama: ");
mama.setSexo(Lee.next());

System.out.println("Ingresa la profesion de la mama: ");
mama.setProfesion(Lee.next());

System.out.println("\n");

System.out.println("El nombre de la mama es: "+mama.nombre);
System.out.println("La edad de la mama es: "+mama.edad);
System.out.println("El sexo de la mama es: "+mama.sexo);
System.out.println("La profesion de la mama es: "+mama.profesion);

break;

case 3:

System.out.println("Ingresa el nombre del hijo: ");
hijo.setNombre(Lee.next());

System.out.println("Ingresa la edad del hijo: ");
hijo.setEdad(Lee.nextInt());

System.out.println("Ingresa el sexo del hijo: ");
hijo.setSexo(Lee.next());

System.out.println("Ingresa la escolaridad del hijo: ");
hijo.setEscolaridad(Lee.next());

System.out.println("Ingresa el promedio del hijo: ");
hijo.setPromedio(Lee.nextFloat());

System.out.println("\n");

System.out.println("El nombre del hijo es: "+hijo.nombre);
System.out.println("La edad del hijo es: "+hijo.edad);
System.out.println("El sexo del hijo es: "+hijo.sexo);
System.out.println("La escolaridad del hijo es: "+hijo.escolaridad);
System.out.println("El promedio del hijo es: "+hijo.promedio);

break;

}






}
}