import java.util.Scanner;
public class Mostrardo{

public static void main(String[]arg){

Scanner Lee=new Scanner(System.in);

int a,b,c=0,d=0;
System.out.print("Dame un numero: ");
a=Lee.nextInt();
System.out.print("Dame un numero mayor: ");
b=Lee.nextInt();
a+=1;
if(a<b){
do{

     System.out.print(a+" ");
a++;
}while(a<b);

}
else{
System.out.println("LOS NUMEROS SON INCORRECTOS");
}
}
}