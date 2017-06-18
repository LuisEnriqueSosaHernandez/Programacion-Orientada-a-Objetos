public class Salon{
int alumnos;
int alumnas;
int totalalum;
double Porm;
double Porf;

public void setAlumnos(int alumnos){
this.alumnos=alumnos;
}
public void setAlumnas(int alumnas){
this.alumnas=alumnas;
}

public void Porcentaje(){
totalalum=alumnos+alumnas;
System.out.println("El total de alumnos es: "+totalalum);
Porm=(alumnos*totalalum)/totalalum;
Porf=(alumnas*totalalum)/totalalum;
System.out.println("El porcentaje de alumnos es: "+Porm+"%");
System.out.println("El porcentaje de alumnas es: "+Porf+"%");
}
}