import java.util.Scanner;
public class main{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
String r1="no",r2="no",r3="si";
int j=1;
while((r1.equals("no"))||(r2.equals("no"))||(r3.equals("si"))){
	if(j%2==0){
System.out.println("Turno de jugador 2");
}
else{
System.out.println("Turno del jugador 1");
}
	System.out.println("Colon descubrio america?");
r1=l.next();
System.out.println("La independencia de mexico fue en el ano 1810");
r2=l.next();
System.out.println("The doors fue un grupo de rock americano");
r3=l.next();
j++;
}
if(j%2==0){
System.out.println("gana el jugador 1");
}
else{
System.out.println("gana el jugador 2");
}
}
}
