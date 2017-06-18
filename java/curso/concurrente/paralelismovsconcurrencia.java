//Paralelismo vs concurrencia
public class paralelismovsconcurrencia extends Thread{
private static int cont=0;
public void run(){
for(int i=0;i<1000;i++){
cont++;
}
}
public static void main(String[]args){
paralelismovsconcurrencia h1=new paralelismovsconcurrencia();
paralelismovsconcurrencia h2=new paralelismovsconcurrencia();
paralelismovsconcurrencia h3=new paralelismovsconcurrencia();
paralelismovsconcurrencia h4=new paralelismovsconcurrencia();
h1.start();
h2.start();
h3.start();
h4.start();
try{
h1.join();
h2.join();
h3.join();
h4.join();
}catch(Exception ex){}
System.out.print(cont);
}
}