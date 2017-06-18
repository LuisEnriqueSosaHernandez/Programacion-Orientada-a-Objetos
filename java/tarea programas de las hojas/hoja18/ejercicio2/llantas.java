public class llantas{
int cantidad;
int total;
public void setCantidad(int cantidad){
this.cantidad=cantidad;
}
public int total(){
if(cantidad<5){
total=(cantidad*300);
System.out.println("El precio de cada llanta es: 300");
}
if(cantidad>=5&&cantidad<=10){
total=(cantidad*250);
System.out.println("El precio de cada llanta es: 250");
}
if(cantidad>10){
total=(cantidad*200);
System.out.println("El precio de cada llanta es: 200");
}
return total;
}


}