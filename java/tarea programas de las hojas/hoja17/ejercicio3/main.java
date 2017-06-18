
import java.util.Scanner;

public class main{
    int horas;
    int pago;

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }
    
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    public int salario(){
        int salario=pago;
        if(horas>40){
            salario*=40;
            horas-=40;
            if(horas<8){
                salario+=horas*(pago*2);
            }else{
                salario+=horas*(pago*3);
            }
        }else{
            salario*=horas;
        }
        return salario;
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        main m=new main();
        
        System.out.println("Dime tus horas de trabajo ");
        m.setHoras(sc.nextInt());
        System.out.println("Dime cuanto te pagan por hora ");
        m.setPago(sc.nextInt());
        
        System.out.println("Tu salario es de: "+m.salario());
    }
}