import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
Bolita b=new Bolita();

System.out.println("De cuanto es tu compra: ");
b.setCompra(l.nextDouble());
System.out.println("De que color es tu bolita: ");
b.setBolita(l.next());

if(b.Total()==0){
	System.out.println("Tu compra es Totalmente Gratis");
}else{
System.out.println("El total a pagar es de: "+b.Total());
}

}
}