public class Bolita{
double compra;
double totalcompra;
String bolita;

public void setCompra(double compra){
this.compra=compra;
}
public void setBolita(String bolita){
this.bolita=bolita;
}

public double Total(){
if(bolita.equals("blanca")){
totalcompra=compra;
}
if(bolita.equals("verde")){
totalcompra=(compra-(compra*.10));

}
if(bolita.equals("amarilla")){
totalcompra=compra-(compra*.25);

}
if(bolita.equals("azul")){
totalcompra=compra-(compra*.50);

}
if(bolita.equals("roja")){
totalcompra=compra;

}
return totalcompra;
}
}