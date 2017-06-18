import java.util.Scanner;
public class Par{
public static void main(String[]arg){

double b;
int a;

Scanner Lee=new Scanner(System.in);
System.out.print("Dame un valor numerico: ");

a=Lee.nextInt();

b=a%2;

if(b==0){
System.out.println("El numero: "+a+" es par"); 
}
else{
System.out.print("El numero: "+a+" es impar");
}
}
}