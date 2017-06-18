import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);

System.out.println("Dame un limite:" );
int a=l.nextInt();
int[]arreglo=new int[a];
for(int i=0;i<a;i++){
System.out.println("Dame un valor para la posicion "+i);
arreglo[i]=l.nextInt();
}
System.out.println("Forma de renglon");
for(int i=0;i<a;i++){
System.out.print(arreglo[i]+" ");
}
System.out.println("");
System.out.println("Forma de columna");
for(int i=0;i<a;i++){
System.out.println(arreglo[i]);
}
}
}