public class Numeros{

float a;
public void setA(float a){
this.a=a;
}
public void Separa(){
int b=(int)a;
float c=a-b;
System.out.println("Parte entera "+b);
System.out.println("Parte fraccionaria "+c);
}
}