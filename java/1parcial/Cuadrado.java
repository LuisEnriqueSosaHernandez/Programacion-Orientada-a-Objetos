class Cuadrado{
	Double Lado;
	Double Area;
	Double Perimetro;

	public void setLado (Double Lado){
	 this.Lado = Lado;
	}
	public Double getLado(){
	 return Lado;
	}
	public void setPerimetro (Double Perimetro){
	 this.Perimetro = Perimetro;
	}
	public Double CalculoPerimetro(){
	 this.Perimetro = Lado*4;
	 return Perimetro;
	}
	public void setArea (Double Area){
	 this.Area = Area;
	}
	public Double CalculoArea(){
	 this.Area = Lado*Lado;
	 return Area;
	}
}