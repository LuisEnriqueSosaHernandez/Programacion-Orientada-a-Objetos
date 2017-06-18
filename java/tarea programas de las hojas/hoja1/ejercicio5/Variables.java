public class Variables{
double a;
double b;
double c;
double d;
double s;

public void setA(double a){
this.a=a;
}
public void setB(double b){
this.b=b;
}
public void setC(double c){
this.c=c;
}
public void setD(double d){
this.d=d;
}
public void Producto(){
double p;
p=a*b*c*d;
System.out.print("EL producto de las variables es: "+p);

System.out.print("\n");
}
public void Suma(){
s=a+b+c+d;
System.out.println("La suma de las variables es: "+s);
}
public void MediaAritmetica(){
double m;
m=s/4;
System.out.println("La media aritmetica de las variables es: "+m);
}

}