import java.util.Scanner;
public class main{
	public static void main(String[]args){
		Scanner l=new Scanner(System.in);
		int[]arreglo=new int[3];
		int aux=0;
		for(int i=0;i<3;i++){
			System.out.println("Dame el numero: "+(i+1));
			arreglo[i]=l.nextInt();
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(arreglo[i]>arreglo[j]){
					aux=arreglo[i];
					arreglo[i]=arreglo[j];
					arreglo[j]=aux;
				}
			}
		}
		System.out.println("Ordenado en forma descendente: ");
		for(int i=0;i<3;i++){
			System.out.println(arreglo[i]);
		}
		
		
		
		
}
}