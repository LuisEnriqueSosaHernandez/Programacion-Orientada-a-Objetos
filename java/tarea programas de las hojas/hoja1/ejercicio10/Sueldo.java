public class Sueldo{
double Salario1;
double Salario2;
double Salario3;

public void setSalario1(double Salario1){
this.Salario1=Salario1;
}
public void setSalario2(double Salario2){
this.Salario2=Salario2;
}
public void setSalario3(double Salario3){
this.Salario3=Salario3;
}

public void Aumento(){
Salario1=Salario1*.10+Salario1;
System.out.println("El nuevo salario del trabajador1 es: "+Salario1);
Salario2=Salario2*.12+Salario2;
System.out.println("El nuevo salario del trabajador2 es: "+Salario2);
Salario3=Salario3*.15+Salario3;
System.out.println("El nuevo salario del trabajador3 es: "+Salario3);
}
}