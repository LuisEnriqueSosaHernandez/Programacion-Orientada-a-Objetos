class Circunferencia{
	float Diametro;
	Double Perimetro;
	Double Pi;
	Double Area;	

	public void setDiametro (float Diametro){
	 this.Diametro = Diametro;
	}
	public float getDiametro(){
	 return Diametro;
	}
	public Double CalculoPerimetro(){
	 Perimetro = Pi * (Diametro);
	 return Perimetro;
	}
	public void setPerimetro (Double Perimetro){
	 this.Perimetro = Perimetro;
	}
	public void setPi (Double Pi){
	 this.Pi = Pi;
	}
	public Double getPi(){
	 return Pi;
	}
	public void setArea (Double Area){
	 this.Area = Area;
	}
	public Double CalculoArea(){
	 Area = Pi * ((Diametro/2)*(Diametro/2));
	 return Area;
	}
}
