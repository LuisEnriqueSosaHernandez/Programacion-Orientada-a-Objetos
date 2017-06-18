import java.util.Scanner;
public class Mostrar{

public static void main(String[]arg){
Scanner Lee=new Scanner(System.in);

int a,b,i;

System.out.print("Introduce un numero chico: ");
a=Lee.nextInt();
a+=1;
System.out.print("Introduce un segundo numero grande: ");
b=Lee.nextInt();
i=a;
while(i<b){
System.out.print(i+" ");
i++;


}
System.out.print("\n");
for(int j=a;j<b;j++){
System.out.print(j+" ");

}



}
}