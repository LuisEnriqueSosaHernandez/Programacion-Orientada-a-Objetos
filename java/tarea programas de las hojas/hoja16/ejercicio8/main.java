import java.util.Scanner;
public class main{
    int hipoteca;
    int inversion;

    public int getHipoteca() {
        return hipoteca;
    }

    public void setHipoteca(int hipoteca) {
        this.hipoteca = hipoteca;
    }

    public int getInversion() {
        return inversion;
    }

    public void setInversion(int inversion) {
        this.inversion = inversion;
    }
    
    public void inversion(){
        if(hipoteca<1000000){
            inversion/=2;
            System.out.println("Pagaste el 50% de la inversion, restan "+inversion);
        }else{
            inversion-=hipoteca;
            if(inversion<=0){
                System.out.println("Inversion pagada");
            }else{
                inversion/=2;
                System.out.println("Hipoteca usada, resta a tu socio: "+inversion);
            }
        }
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        main m=new main();
        
        System.out.println("Dime cuanto es la inversion ");
        m.setInversion(sc.nextInt());
        System.out.println("Dime cuanto es por la hipoteca ");
        m.setHipoteca(sc.nextInt());
        
        m.inversion();
    }
}