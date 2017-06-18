import java.util.Scanner;

public class Media{
public static void main(String[]arg){
int num;
Scanner Lee = new Scanner(System.in);
System.out.print("Introduce la longitud del vector: ");
num=Lee.nextInt();

double[]vec=new double[num];
double total=0;
for(int i=0;i<num;i++){
System.out.print("Introduce un valor numerico: ");
vec[i]=Lee.nextDouble();
}
for(int i=0;i<num;i++){
total+=vec[i];

}
total/=num;
System.out.print("La media es: "+total);


}
}