public class Usatriangulo{
public static void main(String[]arg){
//Triangulo t1=new Triangulo(10,"T1");
//Triangulo t2=new Triangulo(20,"T2");

//System.out.println("El valor de t1 es: "+t1.getArea()+" El nombre es: "+t1.getNombre());
//System.out.println("El valor de t2 es: "+t2.getArea()+" El nombre es: "+t2.getNombre());

Triangulo.setNombre("Tu gfa me ama");
System.out.println("El nombre es "+Triangulo.getNombre());
Triangulo t1=new Triangulo(10);
System.out.println("El valor del area es "+t1.getArea()+" El nombre es: "+Triangulo.getNombre());

//System.out.println("El valor de t1 es: "+t1.getArea()+" El nombre es: "+t1.getNombre());
//System.out.println("El valor de t2 es: "+t2.getArea()+" El nombre es: "+t2.getNombre());



}


}