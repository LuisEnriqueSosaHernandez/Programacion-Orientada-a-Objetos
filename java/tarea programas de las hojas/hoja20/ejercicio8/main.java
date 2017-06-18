
import java.util.Scanner;

public class main{
    float promedio;
    String grado;
    float costo;
    int reprobadas;

    public int getReprobadas() {
        return reprobadas;
    }

    public void setReprobadas(int reprobadas) {
        this.reprobadas = reprobadas;
    }

    public float getCosto() {
        return costo;
    }
    
    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
    
    public void estimulo(){
        float x=180/5,y=300/5;
        if(grado=="b"){
            if(promedio>=9.5){
                costo=55*x;
                costo*=.75;
            }else{
                if(promedio>9){
                    costo=50*x;
                    costo*=.90;
                }else{
                    if(promedio>7){
                        costo=x*50;
                    }else{
                        if((promedio<=7)&&(reprobadas<4)){
                            costo=45*x;
                        }else{
                            if((promedio<=7)&&(reprobadas>3)){
                                costo=40*x;
                            }
                        }
                    }
                }
            }
        }else{
            if(promedio>=9.5){
                costo=55*y;
                costo*=.80;
            }else{
                costo=55*y;
            }
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        main o=new main();
        
        System.out.println("Dime tu grado (p/b)");
        o.setGrado(sc.next());
        System.out.println("Dime tu promedio ");
        o.setPromedio(sc.nextFloat());
        System.out.println("Dime tu numero de materias reprobadas ");
        o.setReprobadas(sc.nextInt());
        o.estimulo();
        
        System.out.println("Tu colegiatura es de: "+o.getCosto());
    }
}