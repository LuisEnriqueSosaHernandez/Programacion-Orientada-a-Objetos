public class Promedio{
double Edades;
double Suma;
double Promedioalum;
double numAlumnos;

public void setEdades(double Edades){
this.Edades=Edades;
}
public double getEdades(){
return Edades;
}
public void setPromedioalum(double Promedioalum){
this.Promedioalum=Promedioalum;
}
public double getPromedioalum(){
return Promedioalum;
}
public void setnumAlumnos(double numAlumnos){
this.numAlumnos=numAlumnos;
}
public double getnumAlumnos(){
return numAlumnos;
}

public double SumaEdades(){
for(int n=0;n<numAlumnos;n++){
Suma+=Edades;

}
System.out.print("La suma es: " +Suma);
return Edades;
}
public double CalculaPromedioalum(){
Promedioalum=Suma/numAlumnos;
System.out.print(" El promedio es: " +Promedioalum);
return Promedioalum;
}
}