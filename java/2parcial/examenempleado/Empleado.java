public class Empleado{
protected String nombre;
protected  int edad;
protected double salario;
protected double aumento;


public void setNombre(String nombre){
this.nombre=nombre;
}
public void setEdad(int edad){
this.edad=edad;
}
public void setSalario(double salario){
this.salario=salario;
}
public void setAumento(double aumento){
this.aumento=aumento;
}

public void clasifica(){
if(edad<=21){
System.out.println("\n");	
System.out.println("Principiante");	
	}	
	if(edad>=22 && edad<=35){
		System.out.println("\n");
System.out.println("Intermedio");	
	}
	if(edad>35){
		System.out.println("\n");
System.out.println("Señor");	
	}
	
}

public void Imprime(){

System.out.println("El nombre es: "+nombre);
System.out.println("La edad es: "+edad);
System.out.println("El salario es: "+salario);
System.out.println("\n");
}
public void aumenta(){
	salario=salario+(salario*aumento);
	System.out.println("El nuevo salario es "+salario);
	
}


}