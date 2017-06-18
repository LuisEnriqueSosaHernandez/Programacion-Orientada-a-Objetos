import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
jubilacion j=new jubilacion();
System.out.println("Cual es tu edad: ");
j.setEdad(l.nextInt());
System.out.println("Cuanto tiempo llevas trabajando: ");
j.setAntiguedad(l.nextInt());
System.out.println("Tu jubilacion es por el tipo "+j.devolver());

}

}