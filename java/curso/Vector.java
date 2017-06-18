import java.util.Scanner;

public class Vector{
public static void main(String[]arg){

int[] vec = new int[5];

Scanner Lee=new Scanner(System.in);

for(int i=0;i<5;i++){
System.out.print("Introduce un numero entero: ");
vec[i]=Lee.nextInt();
 


}
for(int i=0;i<5;i++){
System.out.print(vec[i]+" ");

}
      
}


}