public class main{
	
	public static void main(String[]args){
int[]arreglo={1,2,6,4,5,8,5,3,6,4,4,4,5,9,9,9,6,3,5,6,4,2,2,4};
System.out.println("Arreglo");
for(int i=0;i<arreglo.length;i++){
	System.out.print(arreglo[i]+" ");
	}
	int max=0;
	for(int i=0;i<arreglo.length;i++){
if(arreglo[i]>max){
	max=arreglo[i];
}
	}
	for(int i=0;i<arreglo.length;i++){
	arreglo[i]=(arreglo[i]/max);
	}
	System.out.println("");
	System.out.println("Arreglo Normalizado");
for(int i=0;i<arreglo.length;i++){
	System.out.print(arreglo[i]+" ");
	}

	}
}