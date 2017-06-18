public class Persona{
private double edad;
private double sexo;
private double pulsaciones;
public void setEdad(double edad){
	this.edad=edad;
}
public void setSexo(double sexo){
	this.sexo=sexo;
}
public double total(){
if(sexo==1){
pulsaciones=(220+edad)/10;
}
else{
pulsaciones=(210+edad)/10;
}
return pulsaciones;
}

}