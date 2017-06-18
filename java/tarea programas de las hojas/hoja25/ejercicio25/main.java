import java.util.Scanner;
public class main{
	public static void main(String[]args){
	Scanner l=new Scanner(System.in);
	System.out.println("De que dimensiones quieres tu tabla?: ");
	int a=l.nextInt();
	int b=l.nextInt();
     int[][]tabla=new int[a][b];
     double[]prom=new double[a];

     for(int i=0;i<tabla.length;i++){
     for(int j=0;j<tabla[0].length;j++){
System.out.println("Introduce el valor para la posicion["+i+"]"+"["+j+"]");
   tabla[i][j]=l.nextInt();
     }
      }
      System.out.println("Matriz original");
      for(int i=0;i<tabla.length;i++){
      System.out.println("");
     for(int j=0;j<tabla[0].length;j++){
System.out.print("\t"+tabla[i][j]);
     }
      }


for(int j=0;j<tabla[0].length;j++){
double promedio=0;
	for(int i=0;i<tabla.length;i++){
promedio+=tabla[i][j];
   
	}
  promedio=promedio/a;
  prom[j]=promedio;

}
System.out.println("");
for(int i=0;i<prom.length;i++){
System.out.println("El promedio para la columna "+(i+1)+" =: "+prom[i]);
}


	}

}