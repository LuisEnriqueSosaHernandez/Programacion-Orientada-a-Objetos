import java.util.Scanner;

public class Primo{
public static void main(String[]arg){
int num;
boolean resultado=true;
Scanner Lee=new Scanner(System.in);

System.out.print("Introduce un numero para comprobar si es primo: ");
num=Lee.nextInt();

for(int i=2;i<num;i++){

if(num%i==0){

resultado=false;
}




}
if(resultado){
System.out.println("El numero es primo");

}
else{
System.out.println("El numero no es primo");
}


}


}