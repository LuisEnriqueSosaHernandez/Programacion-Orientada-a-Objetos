public class Conversor{
private String numero;
public void setNumero(String numero){
this.numero=numero;
}
public void invierte(){
System.out.println("El ultimo valor es: ");
char numfinal=numero.charAt(numero.length()-1);
 
System.out.print(numfinal);
int n = (int) numfinal;
System.out.print("\n"+n);
if(n==53){
System.out.println("\nEl numero termina en 5");
}
else{
System.out.println("\nEl numero NO termina en 5");
}
}

}