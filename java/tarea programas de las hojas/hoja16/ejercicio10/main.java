
import java.util.Scanner;

public class main{
    int IMECA;
    int ganancia;

    public int getIMECA() {
        return IMECA;
    }

    public void setIMECA(int IMECA) {
        this.IMECA = IMECA;
    }

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }
    
    public void calcular(){
        int gt=7;
        if(IMECA>170){
            gt*=(ganancia/2);
            System.out.println("Promedio superior");
            System.out.println("Sancion de una semana de trabajo y multa de $"+gt);
        }else{
            System.out.println("Promedio inferior");
            System.out.println("Puede seguir sus operaciones normales");
        }
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        main o=new main();
        int x=0;
        
        System.out.println("Dime tus ganancias diarias");
        o.setGanancia(sc.nextInt());
        for(int i=0;i<5;i++){
            System.out.println("Dime tus puntos IMECA de hoy "+(i+1);
            x+=sc.nextInt();
        }
        x/=5;
        o.setIMECA(x);
        o.calcular();
    }
}