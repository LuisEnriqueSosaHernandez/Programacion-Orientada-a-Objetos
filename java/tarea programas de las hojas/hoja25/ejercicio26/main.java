import java.util.Scanner;
public class main{
	public static void main(String[]args){
	Scanner l=new Scanner(System.in);
	System.out.println("De que dimensiones quieres tu tabla?: ");
	int a=l.nextInt();
	int b=l.nextInt();
     double[][]tabla=new double[a][b];

     for(int i=0;i<tabla.length;i++){
     for(int j=0;j<tabla[0].length;j++){
System.out.println("Introduce el valor para la posicion["+i+"]"+"["+j+"]");
   tabla[i][j]=l.nextDouble();
     }
      }
      System.out.println("Matriz original");
      for(int i=0;i<tabla.length;i++){
      System.out.println("");
     for(int j=0;j<tabla[0].length;j++){
System.out.print("\t"+tabla[i][j]);
     }
      }
      
      double aux;
    for(int i=0;i<tabla.length;i++){
      for(int j=0;j<tabla[0].length;j++){
        for(int x=1;x<tabla[0].length;x++){
          if(tabla[i][j]>tabla[i][x]){
            aux=tabla[i][j];
            tabla[i][j]=tabla[i][x];
            tabla[i][x]=aux;
          }
        }
      }
    }
    
    System.out.println("");
      System.out.println("Matriz ordenada");
for(int i=0;i<tabla.length;i++){
      System.out.println("");
     for(int j=0;j<tabla[0].length;j++){
System.out.print("\t"+tabla[i][j]);
     }
      }


	}

}