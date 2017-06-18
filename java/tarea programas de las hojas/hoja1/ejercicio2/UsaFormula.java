import java.util.Scanner;
public class UsaFormula{
public static void main(String[]arg){
Scanner Lee=new Scanner(System.in);
Formula f=new Formula();
System.out.print("Ingresa valor para x: ");
f.setX(Lee.nextInt());
System.out.print("Ingresa valor para y: ");
f.setY(Lee.nextInt());
f.Resultado();
}
}