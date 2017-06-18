public class Calificacion{
private float calificacion1;
private float calificacion2;
private float calificacion3;
private float promedio;
public void setCalificacion1(float calificacion1){
	this.calificacion1=calificacion1;
	}
	public void setCalificacion2(float calificacion2){
	this.calificacion2=calificacion2;
	}
	public void setCalificacion3(float calificacion3){
	this.calificacion3=calificacion3;
	}
public float calculapromedio(){
	promedio=(calificacion1+calificacion2+calificacion3)/3;
return promedio;
	}	
	}