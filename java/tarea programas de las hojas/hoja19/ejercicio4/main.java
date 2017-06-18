
import java.util.Scanner;

public class main{
    int costo;
    String marca;

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public double costo(){
        double total=costo;
        if(costo>=2000){
            total*=.90;
        }
        if(marca=="NOSY"){
            total*=.95;
        }
        total+=(total*.16);
        return total;
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        main o=new main();
        
        System.out.println("Dime el precio del estereo ");
        o.setCosto(sc.nextInt());
        System.out.println("Dime la marca ");
        o.setMarca(sc.next());
        System.out.println("El costo total es de: "+o.getCosto());
    }
}