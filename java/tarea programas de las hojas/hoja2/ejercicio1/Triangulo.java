class Triangulo{
float base;
float altura;
float lado1;
float lado2;
float lado3;


public void setLado1(float l1){
this.lado1=l1;
}
public float getLado1(){
return lado1;
}


public void setLado2(float l2){
this.lado2=l2;
}
public float getLado2(){
return lado2;
}


public void setLado3(float l3){
this.lado3=l3;
}
public float getLado3(){
return lado3;
}





public void setBase(float b){
this.base=b;
}
public float getBase(){
return base;
}

public void setAltura(float a){
this.altura=a;
}
public float getAltura(){
return altura;
}

public double CalculoAreaCirculo(){
double area;
area=((base)*(altura))/2;
return area;
}

public double CalculoAreaCirculo2(){
double perimetro;
perimetro=(lado1)+(lado2)+(lado3);
return perimetro;
}



}
