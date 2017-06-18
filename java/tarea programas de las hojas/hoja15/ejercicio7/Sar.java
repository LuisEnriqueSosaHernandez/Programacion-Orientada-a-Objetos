import java.util.Scanner;
public class Sar{
private double salario;
private double cuota;
private double porcentaje;
private int Decide;

Scanner Lee=new Scanner(System.in);
public void setSalario(double salario){
this.salario=salario;
}
public void setDecide(int Decide){
this.Decide=Decide;
}
public double Calculacuota(){

if(Decide==1){

System.out.print("De cuanto quieres tu cuota: ");
cuota=Lee.nextDouble();
salario=cuota;

}else{
System.out.print("De cuanto sera el porcentaje de tu cuota: ");
porcentaje=Lee.nextDouble();
salario=salario*(porcentaje/100);
}
return salario;
}


}