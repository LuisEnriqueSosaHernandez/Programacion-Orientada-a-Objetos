
import java.util.Scanner;

public class main{
    
    public void calcular(int x,int y,int z){
        if((x<y)&&(x>z)){
            System.out.println("El numero de enmedio es: "+x);
        }else{
            if((y<x)&&(y>z)){
                System.out.println("El numero de enmedio es: "+y);
            }else{
                if((z<y)&&(z>x)){
                    System.out.println("El numero de enmedio es: "+z);
                }
            }
        }
    }
    
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
       main o=new main();
        int x,y,z;
        System.out.println("Dime un numero");
        x=sc.nextInt();
        System.out.println("Dime un numero");
        y=sc.nextInt();
        System.out.println("Dime un numero");
        z=sc.nextInt();
        o.calcular(x, y, z);
    }
}