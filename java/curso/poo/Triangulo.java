public class Triangulo{
private int area;
private static String nombre;
public Triangulo(int area){
this.area=area;

}
public int getArea(){
return area;
}

public void setArea(int area){
this.area=area;
}
public static void setNombre(String nombre){
Triangulo.nombre=nombre;
}
public static String getNombre(){
return nombre;
}

}