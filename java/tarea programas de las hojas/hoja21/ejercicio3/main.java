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
if(x>0){
	System.out.println("Tu numero se encuentra en el arreglo");
}
else{
	System.out.println("Tu numero no se encuentra en el arreglo");
}

}	

}