
import java.util.Scanner;

public class main{
    int devaluacion;
    int incremento;
    int costo;

    public int getDevaluacion() {
        return devaluacion;
    }

    public void setDevaluacion(int devaluacion) {
        this.devaluacion = devaluacion;
    }

    public int getIncremento() {
        return incremento;
    }

    public void setIncremento(int incremento) {
        this.incremento = incremento;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    public void compra(){
        int dev,inc;
        dev=3*(costo*(devaluacion/100));
        inc=3*(costo*(incremento/100));
        inc/=2;
        if(dev<inc){
            System.out.println("Compra el carro");
        }else{
            System.out.println("Compra el terreno");
        }
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        main o=new main();
        
        System.out.println("Dime el % de devaluacion ");
        o.setDevaluacion(sc.nextInt());
        System.out.println("Dime el % de incremento ");
        o.setIncremento(sc.nextInt());
        System.out.println("Dime el costo de los bienes ");
        o.setCosto(sc.nextInt());
        
        o.compra();
    }
}
