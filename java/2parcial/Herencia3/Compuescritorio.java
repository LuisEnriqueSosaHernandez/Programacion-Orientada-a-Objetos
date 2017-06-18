public class Compuescritorio extends Computador{
protected String Kbmonitor;


public void setKbmonitor(String Kbmonitor){
this.Kbmonitor=Kbmonitor;
}

public void Imprimehijo(){
System.out.println("El sistema operativo es: "+SO);
System.out.println("EL tamano del disco duro: "+GB+" Gb");
System.out.println("El Procesador es: "+Procesador);
System.out.println("Tu memoria del monitor es: "+Kbmonitor);

}

}