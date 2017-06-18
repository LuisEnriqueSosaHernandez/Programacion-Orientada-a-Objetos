public class Conversor{
double pesos;
double s;
public void setPesos(double pesos){
this.pesos=pesos;
}
public void Calcula(){
s=pesos*0.0669295;
System.out.print("Tus pesos valen: "+s+" Dolares");
} 
}