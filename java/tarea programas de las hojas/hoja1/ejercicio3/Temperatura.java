public class Temperatura{
double c;
double f;
double ce;

public void setC(double c){
this.c=c;
}
public double getC(){
return c;
}
public void setF(double f){
this.f=f;
}
public double getF(){
return f;
}
public void setCe(double ce){
this.ce=ce;
}
public double getCe(){
return ce;
}
public double Calcula(){
f=1.8*c+32;
System.out.println("Los farenheit son: "+f);
return f;
}

public double Calcula2(){
ce=f-32;
System.out.print("Los celsius son: "+ce);
return ce;
}

}