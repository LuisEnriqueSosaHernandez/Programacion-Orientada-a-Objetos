public class Tablet extends ComputadoraPortatil{
protected String Pixeles;




public void setPixeles(String Pixeles){
this.Pixeles=Pixeles;
}
public void Imprimenieta(){
System.out.println("El sistema operativo es: "+SO);
System.out.println("\n EL tamano del disco duro: "+GB+" GB");
System.out.println("El Procesador es: "+Procesador);
System.out.println("Tu tamano de pantalla es: "+TP+" pulgadas");
System.out.println("El peso es: "+Kg+" kg");
System.out.println("Los pixeles de la camara son: "+Pixeles+" pixeles");


}

}