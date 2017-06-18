//indeterminismo un problema de la concurrente
//Seccion critica
public class Indetermismo extends Thread{
private static int cont = 0;

public void run(){
for(int i=0; i<100;i++){ 
//cont=100*100=10000
cont++;
}


}
public static void main(String[]args){
Indetermismo[]vec = new Indetermismo[100];

for(int i=0;i<vec.length;i++){
vec[i]=new Indetermismo();
vec[i].start();
}
try{
for(int i=0;i<vec.length;i++){
  vec[i].join();
}
}catch(Exception ex){}

System.out.println(cont);


}
}