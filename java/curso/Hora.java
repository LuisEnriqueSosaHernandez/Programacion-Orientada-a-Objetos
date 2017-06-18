import java.util.Scanner;
public class Hora{
public static void main(String[]arg){
Scanner Lee=new Scanner(System.in);
int hora,min,seg;
System.out.print("Introduce la hora: ");
hora=Lee.nextInt();
System.out.print("Introduce los minutos: ");
min=Lee.nextInt();
System.out.print("Introduce los segundos: ");
seg=Lee.nextInt();
if(hora<24&&min<60&&seg<60){
seg+=1;

if(seg==60){
min+=1;
seg=0;

}
if(min==60){
hora+=1;
min=0;
}
if(hora==24){
hora=0;
}
System.out.println("La hora es: "+hora+":"+min+":"+seg);
}
else{
System.out.println("La hora introducida no es correcta");
}
}
}