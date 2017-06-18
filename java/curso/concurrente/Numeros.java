import java.util.Random;
public class Numeros extends Thread{
private static int tam=8;
private static int[]vec=new int [tam];
private int ini,fin;
public Numeros (int ini,int fin){
this.ini=ini;
this.fin=fin;
}
public void run(){
for(int i=ini;i<fin;i++){
vec[i]*=10;
}
}
public static void main(String[]args){
Random rand= new Random(System.nanoTime());

for(int i=0;i<vec.length;i++){
vec[i]=rand.nextInt(10);
}
Numeros h1=new Numeros(0,4);
Numeros h2=new Numeros(4,8);
h1.start();
h2.start();

try{
    h1.join();
    h2.join();
}catch(Exception ex){}
for(int i=0;i<vec.length;i++){
System.out.print(vec[i]+" ");
}
}
}