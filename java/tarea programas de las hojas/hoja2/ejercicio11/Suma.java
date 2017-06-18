import java.util.Scanner;
public class Suma{
Scanner Lee=new Scanner(System.in);
double num;


public void Sumando(){

for(int i=0;i<9;i++){
System.out.println("Ingresa un numero: ");

//asi tenias tu codigo original y esta mal
/*
num=Lee.nextDouble();
num+=num;
*/



//asi es como se ase lo que tu querias aser
num+=Lee.nextDouble();

}
System.out.println("La suma es: "+num);
}


}