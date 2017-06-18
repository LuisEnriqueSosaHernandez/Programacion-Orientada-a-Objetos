public class Productoscongelados extends Productos{
private String tc;
public Productoscongelados(String fc,String nl,String tc){
        this.fc=fc;
        this.nl=nl;
        this.tc=tc;
}
public void muestracongelados(){
System.out.println("La fecha de caducidad es: "+fc);
System.out.println("El numero del lote es: "+nl);
System.out.println("La temperatura de congelacion recomendada: "+tc);
}
}