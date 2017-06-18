public class banco{
private double dinero;
private double cantidad;

public void setDinero(double dinero){
this.dinero=dinero;
}
public double Calcula(){
cantidad=dinero*.20;
dinero=dinero+cantidad;
if(cantidad>7000){
dinero*=2;
}
return dinero;
}

}