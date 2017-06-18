import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);

String palabra="";
palabra=l.next();
int x=0;
for(int i=0;i<palabra.length();i++){
x++;
}
int a=(x/2);
if(x%2==0){
System.out.println(palabra.substring(a,x));

}
}
}
