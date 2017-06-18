public class Cilindro{
/*___________________________________________________________________
COMO YA ESTAMOS ENVIANDO DIRECTO EL LARGO NO NECESITAMOS ESTA PARTE DEL
	CODIGO
//Rectangulo r=new Rectangulo();
___________________________________________________________________*/
private double radio;
private double pi=3.1416;
private double volumen;
//agregamos la variable largo
private double largo;

public void setRadio(double radio,double largo){
this.radio=radio;
this.largo=largo;
}
public double Calculavolumencilindro(){

volumen=pi*Math.pow(radio,2)*this.largo;
return volumen;
}
}