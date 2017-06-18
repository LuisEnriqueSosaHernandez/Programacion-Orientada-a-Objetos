import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int[]arreglo={1,2,3,4,5,6,7,8,9,10};
System.out.print("Ingresa un numero: ");
int a=l.nextInt();
for(int i=0;i<arreglo.length;i++){
if(a==arreglo[i]){
System.out.println("Tu numero se encuentra en el arreglo en la posicion "+i);
}
}
}
}