public class Fabrica{
int cantidad;
double precio=11000;
double total;
public void setCantidad(int cantidad){
this.cantidad=cantidad;
}
public double retorno(){
if(cantidad<5){
total=(precio*cantidad);
total=total-(total*.10);
}
if(cantidad>=5&&cantidad<10){
total=(precio*cantidad);
total=total-(total*.20);
}
if(cantidad>=10){
total=(precio*cantidad);
total=total-(total*.40);
}
return total;
}
}