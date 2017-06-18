public class Dinero{
public double compra;
public void setCompra(double compra){
this.compra=compra;
}
public double total(){
if(compra>1000){
compra-=compra*.20;	
}
return compra;
}
}