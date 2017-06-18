class Circulo{
float radio;
public void setRadio(float r){
this.radio=r;
}
public float getRadio(){
return radio;
}
public double CalculoAreaCirculo(){
double area;
area=3.1416*(radio*radio);
return area;
}
}
