public class Laptop extends ComputadoraPortatil{
protected String disco;



public void setDisco(String disco){
this.disco=disco;
}
public void Imprimenieto(){
	System.out.println("El sistema operativo es: "+SO);
System.out.println("EL tamano del disco duro: "+GB+" GB");
System.out.println("El Procesador es: "+Procesador);
System.out.println("Tu tamano de pantalla es: "+TP+" pulgadas");
System.out.println("El peso es: "+Kg+" kg");
System.out.println("Tu tipo de disco es: "+disco);

}

}