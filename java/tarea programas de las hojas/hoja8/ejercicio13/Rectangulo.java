public class Rectangulo{
private double largo;
private double ancho;
private double altura;
private double volumen;


/*esta parte de abajo se llama constructor adiferencia de los set
este se ejecuta en el momento enque creas el objeto en el main 
como ves no tiene que tipo de valor retornara(int,float,etc)
y tampoco tiene    void

para una mejor explicasion de lo que son los contructores y como
se utilizan busca en youtube
*/
public Rectangulo(double largo,double altura, double ancho)
{
	this.largo=largo;
	this.altura=altura;
	this.ancho=ancho;
}
/*
CON  ESTA PARTE DE ACA ARRIBA ME AORRO TODOLOS SET DADO QUE 
EN ESTE CASO EL PROGRAMA ES SIMPLE NO SE NESESITAN (EN OTROS MAS COMPLEJOS SI)

NO BORRE NADA DE TU CODIGO ORIGINAL SOLO LO CONVERTI A COMENTARIO
*/


/*public void setLargo(double largo){
this.largo=largo;
}*/

/*__________________________________________________
 COMO YO LO ARIA ESTA PARTE DEL CODIGO NO SIRVE
public double getLargo(){
return largo;
}
*/


/*public void setAncho(double ancho){
this.ancho=ancho;
}*/
/*public void setAltura(double altura){
this.altura=altura;
}*/

public double Calculavolumen(){
volumen=largo*ancho*altura;
return volumen;
}

}