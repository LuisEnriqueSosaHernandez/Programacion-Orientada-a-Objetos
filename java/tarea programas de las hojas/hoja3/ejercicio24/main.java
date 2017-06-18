import java.util.Scanner;
public class main{
public static void main(String[]args){
Scanner l=new Scanner(System.in);
int [][] matriz=new int[5][6];
for(int i=0;i<matriz.length;i++){
for(int j=0;j<matriz[0].length;j++){
System.out.println("Dame el valor para la posicion: ["+i+"]"+"["+j+"]");
matriz[i][j]=l.nextInt();
}
}
for(int i=0;i<matriz.length;i++){
	System.out.println("");
for(int j=0;j<matriz[0].length;j++){
System.out.print(matriz[i][j]);
}

}
}
}
