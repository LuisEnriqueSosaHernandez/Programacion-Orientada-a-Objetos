public class Finanzas{
private double monto;
private double cuota;

public void setMonto(double monto){
	this.monto=monto;
}

public double Cuota(){
if(monto<50000){
cuota=monto*.3;
}
else{
cuota=monto*.2;
}


return cuota;
}




}