public class Circulo extends Figuras{
double Pi=3.1416;
double radio;
public void setRadio(double radio){
this.radio=radio;
}
public double calcularArea(){
area=Pi*Math.pow(radio,2);
return area;
}
public double calcularPerimetro(){
perimetro=2*Pi*radio;
return perimetro;
}

}