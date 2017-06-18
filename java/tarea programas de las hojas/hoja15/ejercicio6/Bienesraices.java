public class Bienesraices{
private double ingresos;
private double costo;
private double enganche;
private double mensualidades;

public void setIngresos(double ingresos){
this.ingresos=ingresos;
}
public void setCosto(double costo){
this.costo=costo;
}

public double Calculaenganche(){
if(ingresos<8000){
enganche=costo*.15;
}
else{
enganche=costo*.30;
}


return enganche;
}
public double Calculamensualidades(){
if(ingresos<8000){
costo=costo-enganche;
mensualidades=costo/120;
}
else{
costo=costo-enganche;
mensualidades=costo/84;

}
return mensualidades;
}
}