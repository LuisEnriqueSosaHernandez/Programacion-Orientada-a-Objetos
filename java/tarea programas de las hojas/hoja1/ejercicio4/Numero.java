public class Numero{
double a;
public void setA(double a){
this.a=a;
}
public double Evalua(){
if(a>=0){
System.out.print("El valor es positivo");
}
else{
System.out.println("El valor es negativo");
}
return a;
}
}