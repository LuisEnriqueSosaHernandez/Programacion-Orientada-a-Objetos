public class Productosfrescos extends Productos{
private String fe;
private String po;

public Productosfrescos(String fc,String nl,String fe,String po)
{
	this.fc=fc;
        this.nl=nl;
        this.fe=fe;
        this.po=po;
}
public void muestrafrescos(){
System.out.println("La fecha de caducidad es: "+fc);
System.out.println("El numero del lote es: "+nl);
System.out.println("La fecha de envasado: "+fe);
System.out.println("El pais de origen es: "+po);
}

}