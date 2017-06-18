import java.util.Scanner;
public class main{
	public static void main(String[]args){
	Scanner l=new Scanner(System.in);
	System.out.println("De que dimensiones quieres tu tabla?: ");
	int a=l.nextInt();
	int b=l.nextInt();
     int[][]tabla=new int[a][b];

     for(int i=0;i<tabla.length;i++){
     for(int j=0;j<tabla[0].length;j++){
System.out.println("Introduce el valor para la posicion["+i+"]"+"["+j+"]");
   tabla[i][j]=l.nextInt();
     }
      }
      System.out.println("Matriz");
      for(int i=0;i<tabla.length;i++){
      System.out.println("");
     for(int j=0;j<tabla[0].length;j++){
System.out.print("\t"+tabla[i][j]);
   
     }
      }

      }
      }