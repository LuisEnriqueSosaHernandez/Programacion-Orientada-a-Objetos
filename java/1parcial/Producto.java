class  Producto{
float Precio;
double PrecioTotal;
double PrecioTotal2;
int NumProductos;

public void setNumProductos (int Numproductos){
this.NumProductos=NumProductos;
}
public int getNumProductos(){
return NumProductos;
}

public void setPrecio (float Precio){
this.Precio=Precio;
}
public float getPrecio(){
return Precio;
}
public void setPrecioTotal (double PrecioTotal){
	 this.PrecioTotal = PrecioTotal;
	}
public double getPrecioTotal(){
	return PrecioTotal;
	}
	public Double CalculaPrecioTotal(){
	 PrecioTotal = Precio+(Precio*.16);
	 return PrecioTotal;
	}
public double getPrecioTotal2(){
	return PrecioTotal2;
	}
	public Double CalculaPrecioTotal2(){
	 PrecioTotal2 = Precio+(Precio*.16)-producto*precio*.3;
	 return PrecioTotal2;
	}
}

