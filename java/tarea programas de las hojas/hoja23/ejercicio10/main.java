import java.util.Scanner;
public class main{

public static void main(String[]args){
Scanner l=new Scanner(System.in);
System.out.println("De que dimension quiere su arreglo: ");
int a=l.nextInt();
double x=0,y=0;
int[]arreglo=new int[a];
for(int i=0;i<arreglo.length;i++){
System.out.println("Dame el valor para la posicion "+(i+1));
	arreglo[i]=l.nextInt();
}	
System.out.println("Arreglo original: ");
for(int i=0;i<arreglo.length;i++){
System.out.print(arreglo[i]+" ");
	}
	System.out.println("");
	System.out.println("Arreglo ordenado");
int aux;
for(int i=0;i<arreglo.length;i++){
	for(int j=0;j<arreglo.length;j++){
		if(arreglo[i]<arreglo[j]){
		aux=arreglo[i];
		arreglo[i]=arreglo[j];
		arreglo[j]=aux;
	}
	}
}
for(int i=0;i<arreglo.length;i++){
System.out.print(arreglo[i]+" ");
	}
	System.out.println("");
if(a%2!=0){
	a=a/2+1;
	for(int i=0;i<arreglo.length;i++){
		if((i+1)==a){
System.out.println("la mediana es :"+arreglo[i]);
}
	}

}
else{
		int q=a/2;
		int b=(a/2)+1;
	for(int i=0;i<arreglo.length;i++){
		if((i+1)==q){
 x=arreglo[i];
}
if((i+1)==b){
y=arreglo[i];
}
}
double mediana=(x+y)/2;
System.out.println("la mediana es :"+mediana);

}
}
}