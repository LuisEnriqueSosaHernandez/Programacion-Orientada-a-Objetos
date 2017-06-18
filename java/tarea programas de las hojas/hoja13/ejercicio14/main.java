import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int a=l.nextInt();
int b=l.nextInt();
int c = 0;

while ( a != b)
{
if ( a>b)
{
c= a-b;
a=b;
b=c;
}

else{
c= b-a;
a=b;
a=c;
}
}

System.out.println("El mayor comun divisor es: "+c);

}
}