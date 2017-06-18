import java.util.Scanner;
public class resistenciatotal extends resistencias{
Scanner l=new Scanner(System.in);


public void calcularesistencia(){
	System.out.print("Cuantas resistencias quieres calcular:");
    a=l.nextInt();
	double arreglo[]=new double[a];
for(int i=0;i<a;i++){
System.out.print("Ingresa un valor para resistencia");
arreglo[i]=l.nextDouble();
resistencia+=arreglo[i];

}
System.out.println("Resistencia total: "+resistencia);
}

}