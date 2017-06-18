public class principal2 extends Thread{
private int id;
public principal2(int id){
this.id=id;
}
public void run(){
System.out.println("Soy el hilo: "+id);
}

public static void main(String[]args){
principal2[]vec = new principal2[5];

for(int i=0;i<vec.length;i++){
vec[i]=new principal2(i+1);
vec[i].start();
}
try{
for(int i=0;i<vec.length;i++){
vec[i].join();
}
}catch(Exception ex){}
System.out.println("Soy el hilo principal");

}

}

