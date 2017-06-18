public class Empleado_deconfianza extends Empleado{
protected double cuotamedica;
public void setCuotamedica(double cuotamedica){
this.cuotamedica=cuotamedica;
}
public void Imprime3(){
Imprime();
System.out.println("La cuota de servicio medico es: "+cuotamedica);
}
}