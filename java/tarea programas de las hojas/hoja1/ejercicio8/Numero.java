public class Numero{
double num1;
double num2;
double num3;
public void setNum1(double num1){
this.num1=num1;
}
public void setNum2(double num2){
this.num2=num2;
}

public void Operacion(){

num1+=num1;
num3=num1+(Math.pow(num2,2));
System.out.print("El resultado es: "+num3);
}
}