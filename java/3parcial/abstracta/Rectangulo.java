public class Rectangulo extends Figuras{
double base;
double altura;
public void setBase(double base){
this.base=base;
}
public void setAltura(double altura){
this.altura=altura;
}

public double calcularArea(){
area=base*altura;
return area;
}
public double calcularPerimetro(){
perimetro=2*(base+altura);
return perimetro;
}

}