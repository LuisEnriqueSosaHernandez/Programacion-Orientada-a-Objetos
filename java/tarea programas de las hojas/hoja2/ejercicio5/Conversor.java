public class Conversor{
double pesos;
double dolar;
double s;
public void setPesos(double pesos){
this.pesos=pesos;
}
public void setDolar(double dolar){
this.dolar=dolar;
}
public void Calcula(){
s=pesos*dolar;
System.out.print("Tus pesos valen: "+s+" Dolares");
} 
}