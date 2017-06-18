
import java.util.Scanner;

public class main{
    float saldo;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void decisiones(){
        float insumos, incentivos,p;
        if(saldo<0){
            p=(saldo*-1)+10000;
            saldo=3000;
            insumos=saldo/2;
            incentivos=saldo/2;
            System.out.println("Insumos: "+insumos);
            System.out.println("Incentivos: "+incentivos);
            System.out.println("Prestamo del banco: "+p);
        }else{
            if(saldo<20000){
                p=20000-saldo;
                saldo=13000;
                insumos=saldo/2;
                incentivos=saldo/2;
                System.out.println("Insumos: "+insumos);
                System.out.println("Incentivos: "+incentivos);
                System.out.println("Prestamo del banco: "+p);
            }else{
                saldo-=7000;
                insumos=saldo/2;
                incentivos=saldo/2;
                System.out.println("Insumos: "+insumos);
                System.out.println("Incentivos: "+incentivos);
            }
        }
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        main o=new main();
        
        System.out.println("Dime tu capital actual ");
        o.setSaldo(sc.nextFloat());
        o.decisiones();
    }
}