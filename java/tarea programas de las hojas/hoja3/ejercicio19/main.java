import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
System.out.println("Que tablas de multiplicar desea? ");
System.out.println("De la numero: ");
int a=l.nextInt();
System.out.println("A la: ");
int b=l.nextInt();

for(a=a;a<b;a++){
System.out.println("");
for(int i=1;i<11;i++){
System.out.println(a+"*"+i+"="+(a*i));
}

}



}
}