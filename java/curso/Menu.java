import java.util.Scanner;
public class Menu{
public static void main(String[]arg){
Scanner Lee=new Scanner(System.in);
int a;
do{
System.out.println("1.Ensenar por pantalla hola mundo");
System.out.println("2.Ensenar por pantalla numeros entre 5y 10");
System.out.println("3.Ensenar por pantalla Empieza a programar");
System.out.print("Introduce una opcion: ");
a=Lee.nextInt();

}while(a>3||a==0);

switch(a){

case 1:
System.out.println("Hola Mundo");
break;
case 2:
for(int i=6;i<10;i++){
System.out.print(i+" ");
}
break;
case 3:
System.out.println("Empieza a programar");
break;

}
}
}