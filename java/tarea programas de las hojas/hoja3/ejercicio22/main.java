import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
double aux;
double[] arreglo={5.4,732,55,873,55,3323,567,433,6678,28764,34,4,3,2,5,6,7,6443,222,567,5444,333,22,456,00,333};
for(int i=0;i<arreglo.length;i++){
	for(int j=1;j<arreglo.length;j++){
	if(arreglo[i]<arreglo[j]){
		aux=arreglo[i];
		arreglo[i]=arreglo[j];
		arreglo[j]=aux;
	}	
	}

}
for(int i=0;i<arreglo.length;i++){
	System.out.println(arreglo[i]);
}

}
}