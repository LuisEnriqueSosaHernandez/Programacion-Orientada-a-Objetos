import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
System.out.println("Cual es la posicion dela emfermera sentada o acostada");
String a=l.next();
double b;
if(a.equals("sentada")){
System.out.print("Cuanto tiempo ha estado sentada en minutos? ");
b=l.nextInt();
b=1.66*b;
System.out.println(b);
}
if(a.equals("acostada")){
System.out.print("Cuanto tiempo ha estado acostada en minutos? ");
b=l.nextInt();
b=1.08*b;
System.out.println(b);
}


}
}