public class Banco{
double Banco;

public void setBanco(double Banco){
this.Banco=Banco;
}
public void CalculaInteres(){
Banco=Banco*.20+Banco;
System.out.print("Lo que tu vas a pagar con un 20% de interes es: "+Banco);
}
}