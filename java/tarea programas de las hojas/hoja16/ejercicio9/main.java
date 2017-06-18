import java.util.Scanner;

public class main{
    int hectareas;

    public int getHectareas() {
        return hectareas;
    }

    public void setHectareas(int hectareas) {
        this.hectareas = hectareas;
    }
    
    
    public void reforestar(){
        int pinos=8,oyamel=15,cedro=10;
        float x,y,z;
        hectareas*=10000;
        x=hectareas;
        y=hectareas;
        z=hectareas;
        if(hectareas<1000000){
            x*=.70;x/=10;pinos*=x;
            y*=.20;y/=15;oyamel*=y;
            z*=.10;z/=18;cedro*=z;
            System.out.println("Numero de pinos: "+pinos);
            System.out.println("Numero de oyameles: "+oyamel);
            System.out.println("Numero de cedros: "+cedro);
        }else{
            x*=.50;x/=10;pinos*=x;
            y*=.30;y/=15;oyamel*=y;
            z*=.20;z/=18;cedro*=z;
            System.out.println("Numero de pinos: "+pinos);
            System.out.println("Numero de oyameles: "+oyamel);
            System.out.println("Numero de cedros: "+cedro);
        }
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
         main o=new main();
        
        System.out.println("Dime el numero de hectareas ");
        o.setHectareas(sc.nextInt());
        o.reforestar();
    }
}