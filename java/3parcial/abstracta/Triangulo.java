public class Triangulo extends Rectangulo{
double lado1;
double lado2;
double lado3;

public void setLado1(double lado1){
this.lado1=lado1;
}
public void setLado2(double lado2){
this.lado2=lado2;
}
public void setLado3(double lado3){
this.lado3=lado3;
}
public double calcularArea(){
area=(lado1*lado2)/2;
return area;
}
public double calcularPerimetro(){
perimetro=lado1+lado2+lado3;
return perimetro;
}

}