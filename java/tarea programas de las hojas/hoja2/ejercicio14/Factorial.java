import java.util.Scanner;
class Factorial{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
Numero num=new Numero();
int factorial=1;
int factorial2=-1;
System.out.print("Ingresa un numero entero: ");
num.setNumero(Lee.nextInt());
int n=num.numero;
if(n>=0){
for(int i=n;i>1;i--){
factorial=factorial*i;
}
System.out.print("El factorial es : "+factorial);
}
else{
for(int i=n;i<-1;i++){
factorial2=factorial2*i;
}
System.out.print("El factorial es : "+factorial2);
}
}
}