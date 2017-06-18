import java.util.Scanner;
public class Matriz{
public static void main(String[]arg){
Scanner Lee= new Scanner(System.in);

int[][]matriz=new int[2][2];
for(int i=0;i<matriz.length;i++){
for(int j=0;j<matriz[0].length;j++){
System.out.print("introduce tu valor para matriz: ["+i+"]"+"["+j+"]: ");
matriz[i][j]=Lee.nextInt();
}
}
for(int i=0;i<matriz.length;i++){
for(int j=0;j<matriz[0].length;j++){
System.out.print("["+i+"]"+"["+j+"]"+" "+matriz[i][j]);
System.out.print(" ");
}
System.out.println();
}

}
}
