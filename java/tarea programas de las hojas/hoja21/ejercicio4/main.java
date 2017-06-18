import java.util.Scanner;
public class main{

public static void main(String[]args){
Scanner l=new Scanner(System.in);
System.out.println("De que dimension quiere su arreglo: ");
int a=l.nextInt();
int[]arreglo=new int[a];
int x=0;
for(int i=0;i<arreglo.length;i++){
System.out.println("Dame el valor para la posicion "+(i+1));
	arreglo[i]=l.nextInt();
}	
System.out.println("Numero a buscar: ");
int b=l.nextInt();
for(int i=0;i<arreglo.length;i++){
if(arreglo[i]==b){
 x+=1;
}
}
System.out.println("El arreglo");
for(int i=0;i<arreglo.length;i++){
System.out.print(arreglo[i]+" ");
 
}	
if(x>0){
	System.out.println("");
	System.out.println("Tu numero se encuentra en el arreglo");
	System.out.print("En las posiciones"+" ");
	for(int i=0;i<arreglo.length;i++){
if(arreglo[i]==b){
 System.out.print((i+1)+" ");
}
}

}
else{
	System.out.println("");
	System.out.println("Tu numero no se encuentra en el arreglo");
}

}
}