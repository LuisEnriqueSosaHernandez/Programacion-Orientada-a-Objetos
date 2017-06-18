public class Conversor{
private String numero;
public void setNumero(String numero){
this.numero=numero;
}
public void invierte(){
System.out.println("Los digitos que lo componen son: ");
for(int i=0;i<numero.length();i++){
char numcifra=numero.charAt(i);
System.out.print(numcifra+" ");
}
}

}