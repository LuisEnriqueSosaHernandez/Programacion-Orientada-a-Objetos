public class Operaciones{
public int a;
public float b;
public double c;



public void setA(int a){
this.a=a;
}
public void setB(float b){
this.b=b;
}
public void setC(double c){
this.c=c;
}


public int Calculo(int a){
return (a*2);	
	}
public float Calculo(float b){
return (b*2);	
	}
	public double Calculo(double c){
return (c*2);	
	}
	public double Calculo(double c,int a){
return (c*a);	
	}
public double Calculo(double c,int a,float b){
double multi=c*a*b;
return (c*a*b);	
	}
	




}