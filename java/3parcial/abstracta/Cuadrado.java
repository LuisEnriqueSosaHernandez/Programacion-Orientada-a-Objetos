public class Cuadrado extends Figuras{
double lado;
public void setLado(double lado){
this.lado=lado;
}
public double calcularArea(){
area=lado*lado;
return area;
}
public double calcularPerimetro(){
perimetro=lado*4;
return perimetro;
}



}