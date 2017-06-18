public class Productosrefrigerados extends Productos{
private String co;
public Productosrefrigerados(String fc,String nl,String co){
        this.fc=fc;
        this.nl=nl;
        this.co=co;
}
public void muestrarefrigerados(){
System.out.println("La fecha de caducidad es: "+fc);
System.out.println("El numero del lote es: "+nl);
System.out.println("El codigo de organismo de organismo de supervision alimentaria es: "+co);
}
}