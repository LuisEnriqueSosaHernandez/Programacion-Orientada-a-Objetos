public class Empleado_sindicalizado extends Empleado{
protected int numregistro;
protected double cuota;

public void setNumregistro(int numregistro){
this.numregistro=numregistro;
}
public void setCuota(double cuota){
this.cuota=cuota;
}
public void Imprime2(){
Imprime();
System.out.println("El numero de registro sindicial es: "+numregistro);
System.out.println("La cuota es: "+cuota);
}


}