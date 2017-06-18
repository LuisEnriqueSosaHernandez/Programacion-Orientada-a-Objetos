import java.util.Scanner;
public class Suma{
Scanner Lee=new Scanner(System.in);
double num;
int a;
double promedio;
public void setA(int a){
this.a=a;
}


public void Sumando(){

for(int i=0;i<a;i++){
System.out.println("Ingresa un numero: ");

//asi tenias tu codigo original y esta mal
/*
num=Lee.nextDouble();
num+=num;
*/



//asi es como se ase lo que tu querias aser
num+=Lee.nextDouble();

promedio=num/a;

}
System.out.println("El promedio es: "+promedio);
}


}