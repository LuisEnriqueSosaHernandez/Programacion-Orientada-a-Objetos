public class Numero{
int num;
double num2;
public void setNum(int Num){
this.num=num;
}
public double getNum(){
return num;
}


public double Calculaparoimpar(){
num2=num%2;
if(num2==0){
System.out.println("El numero es impar");
}
else{
System.out.println("El numero es par");
}
return num2;
}

}