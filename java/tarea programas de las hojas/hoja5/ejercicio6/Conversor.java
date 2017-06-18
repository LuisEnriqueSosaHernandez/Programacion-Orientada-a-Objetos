public class Conversor{
private String numero;
public void setNumero(String numero){
this.numero=numero;
}
public void invierte(){
System.out.println("El valor invertido es: ");
for(int i=1;i<=numero.length();i++){
char numinvertido=numero.charAt(numero.length()-i);
System.out.print(numinvertido);
}
}

}