import java.util.Scanner;
public class Testherencia2{
public static void main(String[]args){
Scanner Lee=new Scanner(System.in);
String fc,nl,fe,po,co,tc;
System.out.println("\nProductos frescos: ");
System.out.print("Ingresa la fecha de caducidad: ");
fc=Lee.next();
System.out.print("Ingresa el numero del lote: ");
nl=Lee.next();
System.out.print("Ingresa la fecha de envasado: ");
fe=Lee.next();
System.out.print("Ingresa el pais de origen: ");
po=Lee.next();

Productosfrescos f=new Productosfrescos(fc,nl,fe,po);

System.out.println("\nProductos refrigerados: ");

System.out.print("Ingresa la fecha de caducidad: ");
fc=Lee.next();
System.out.print("Ingresa el numero del lote: ");
nl=Lee.next();
System.out.print("Ingresa el codigo de organismo de organismo de supervision alimentaria: ");
co=Lee.next();


Productosrefrigerados r=new Productosrefrigerados(fc,nl,co);

System.out.println("\nProductos congelados: ");

System.out.print("Ingresa la fecha de caducidad: ");
fc=Lee.next();
System.out.print("Ingresa el numero del lote: ");
nl=Lee.next();
System.out.print("Ingresa la temperatura de congelacion recomendada: ");
tc=Lee.next();

Productoscongelados c=new Productoscongelados(fc,nl,tc);

System.out.print("\nResultados frescos");
System.out.print("\n");
f.muestrafrescos();
System.out.print("\nResultados refrigerados");
System.out.print("\n");
r.muestrarefrigerados();
System.out.print("\nResultados congelados");
System.out.print("\n");
c.muestracongelados();



}

}