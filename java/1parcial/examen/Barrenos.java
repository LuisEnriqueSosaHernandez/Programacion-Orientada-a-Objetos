public class Barrenos{

double volbarreno;
double rabarreno;
double volbarreno2;
double rabarrenodos;

//hexagono
double h;
double l;
double ap;
double p;
double ab;
double v;



public void setRabarreno(double rabarreno){
this.rabarreno=rabarreno;
}
public void setRabarrenodos(double rabarrenodos){
this.rabarrenodos=rabarrenodos;
}
public void setH(double h){
this.h=h;
}
public void setL(double l){
this.l=l;
}
public void setAp(double ap){
this.ap=ap;
}
public void Volumen(){
volbarreno=3.14*(rabarreno*rabarreno)*h;
System.out.println("El volumen del primer cilindro es"+volbarreno);

}
public void Volumen2(){
volbarreno2=3.1416*(rabarrenodos*rabarrenodos)*h;
System.out.println("El volumen del segundo cilindro es"+volbarreno2);

}
//Hexagono

public void Basehexagono(){
p=l*6;

ab=(p*ap)/2;
v=ab*h;

System.out.println("El perimetro es"+p);
System.out.println("El area de la base es"+ab);
System.out.println("El volumen del hexagono es"+v);

v-=volbarreno+volbarreno2;
System.out.println("El volumen real del hexagono es"+v);

}



}

