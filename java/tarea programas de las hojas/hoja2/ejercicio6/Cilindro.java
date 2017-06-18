public class Cilindro{
double h;
double r;

public void setH(double h){
this.h=h;
}
public void setR(double r){
this.r=r;
}
public void Volumen(){
double v;
v=3.1416*Math.pow(r,2)*h;
System.out.print("La capacidad del cilindro es: "+v);

}

}