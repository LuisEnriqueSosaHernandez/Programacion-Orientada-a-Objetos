//Multiplicar por 10 todos lo elemtentos de uan matriz de forma concurrente y medir el tiempo\

import java.util.Random;
public class multiplica extends Thread{
private static int tam=800;
private static int[][] matriz=new int[tam][tam];
private int inicio,fin;
public multiplica(int inicio,int fin){
	this.inicio=inicio;
	this.fin=fin;
}
public void run(){
for(int i=inicio;i<fin;i++){
	for(int j=0;j<matriz[0].length;j++){
		matriz[i][j]*=10;
	}
}
}
public static void main(String[]args){
Random rand=new Random(System.nanoTime());
double tiempo_inicio,tiempo_final;
for(int i=0;i<matriz.length;i++){
	for(int j=0;j<matriz[0].length;j++){
		matriz[i][j]=rand.nextInt(10);
	}
}
tiempo_inicio=System.nanoTime();//Hora en nanosegundos
multiplica h1=new multiplica(0,200);
multiplica h2=new multiplica(200,400);
multiplica h3=new multiplica(400,600);
multiplica h4=new multiplica(600,800);
h1.start();
h2.start();
h3.start();
h4.start();
try{
	h1.join();
	h2.join();
	h3.join();
	h4.join();
}catch(Exception e){}
tiempo_final=System.nanoTime()-tiempo_inicio;
System.out.println((tiempo_final/1000000)+"milisegundos");
for(int i=0;i<matriz.length;i++){
	for(int j=0;j<matriz[0].length;j++){
		System.out.print(matriz[i][j]+" ");
	}
	System.out.println();
}
}
}