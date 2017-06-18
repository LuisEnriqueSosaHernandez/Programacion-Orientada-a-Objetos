public class Escuela{
private int materias;
private double costo;
private double promedio;
private double total;

public void setMaterias(int materias){
this.materias=materias;
}
public void setCosto(double costo){
this.costo=costo;
}
public void setPromedio(double promedio){
this.promedio=promedio;
}
public double Preciototal(){
if(promedio>=9){
total=materias*costo;
total=total-(total*.30);

}else{
total=materias*costo;
total=total+(total*.10);

}
return total;

}



}