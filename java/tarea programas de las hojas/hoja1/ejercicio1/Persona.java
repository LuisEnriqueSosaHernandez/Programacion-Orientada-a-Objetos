//Calcular la edad pidiendo el ano de nacimiento
public class Persona{
int Actualidad=2015;
int anodenacimiento;
int Edad;
public void setAnodenacimiento(int anodenacimiento){
this.anodenacimiento=anodenacimiento;
}
public int getAnodenacimiento(){
return anodenacimiento;
}
public void setEdad(int edad){
this.Edad=Edad;
}

public int getEdad(){
return Edad;
}
public int CalculaEdad(){
Edad=Actualidad-anodenacimiento;
return Edad;
}



} 