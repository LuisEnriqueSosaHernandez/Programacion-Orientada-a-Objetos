
import java.util.Scanner;

public class main{
    float kilos;
    float precio;

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public float getKilos() {
        return kilos;
    }

    public void setKilos(float kilos) {
        this.kilos = kilos;
    }
    
    public double total(){
        double total=precio;
        if(kilos<=2){
            total*=kilos;
        }else{
            if(kilos<=5){
                total*=kilos;
                total*=.90;
            }else{
                if(kilos<=10){
                    total*=kilos;
                    total*=.85;
                }else{
                    total*=kilos;
                    total*=.80;
                }
            }
        }
        return total;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        main o=new main();
        
        System.out.println("Dime el numero de kilos ");
        o.setKilos(sc.nextFloat());
        System.out.println("Dime el precio por kilo ");
        o.setPrecio(sc.nextFloat());
        
        System.out.println("Tu costo total es de: "+o.total());
    }
}