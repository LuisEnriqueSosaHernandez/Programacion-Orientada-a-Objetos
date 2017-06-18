public class Sueldo{
private int Horas;
private int Hextras;
private double paga;
private double pextra;
public void setHoras(int Horas){
	this.Horas=Horas;
}
public double Total(){
if(Horas>40){
Hextras=Horas-40;
pextra=Hextras*20;
paga=(40*16)+pextra;
}else{
paga=Horas*16;
}
return paga;
}

}