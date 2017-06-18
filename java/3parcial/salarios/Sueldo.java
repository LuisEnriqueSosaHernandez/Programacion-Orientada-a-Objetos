public abstract class Sueldo{
protected String nombre;
protected int edad;
protected double sueldo;

public void setNombre(String nombre){
	this.nombre=nombre;
}
public void setEdad(int edad){
	this.edad=edad;
}
public void setSueldo(double sueldo){
	this.sueldo=sueldo;
}


public abstract double calculasueldo();
}






/*salario base de empleados , los sindicalizados ganan mas 15 % de sobresueldo , mas 150 pesos de despensa menos 22 de cuota
los no sindicalizados ganan mas 1 % por ano teniendo como limite 15*/
