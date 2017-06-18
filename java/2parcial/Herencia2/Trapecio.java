class Trapecio extends Masdisparejos{
protected float lado4;

public void setLado4(float lado4){
this.lado4=lado4;
}
public float getLado4(){
return lado4;
}
public double Perimetrotrapecio(){
perimetro=lado1+lado2+lado3+lado4;
return perimetro;
}
public double Areatrapecio(){
area=((lado1+lado2)/2)*altura;
return area;
}
}
