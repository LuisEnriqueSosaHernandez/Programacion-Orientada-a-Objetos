public class UsaArreglo{
public static void main(String[]args){
int numero;
int numero2;
Arreglo[] arreglo=new Arreglo[601];
Arreglo2[] arreglo2=new Arreglo2[601];
System.out.println("\n");
for(int i=1;i<=600;i++){
numero=i;
arreglo[i]=new Arreglo(numero);
}
for(int i=600;i>=1;i--){
numero2=i;
arreglo2[i]=new Arreglo2(numero2);
}

System.out.println("\n");
System.out.println("Arreglo");
for(int i=1;i<=600;i++){
System.out.print(" "+arreglo[i].getNumero());
}
System.out.println("\n");
System.out.println("Arreglo2");
for(int i=600;i>=1;i--){
System.out.print(" "+arreglo2[i].getNumero2());
}
}
}
