public class Conversor{
private double grados;
private double radianes;

public void setGrados(double grados){
this.grados=grados;
}
public double Convierte(){
radianes=grados*0.0174532925 ;
return radianes;
}
}