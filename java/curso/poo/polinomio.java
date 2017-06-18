import java.util.Random;
public class polinomio{
private Vertice[]v;

public polinomio(int tam){
int aux1,aux2;
Random rand=new Random(System.nanoTime());
v=new Vertice[tam];

for(int i=0;i<tam;i++){
aux1=rand.nextInt(10);
aux2=rand.nextInt(10);

v[i]=new Vertice(aux1,aux2);


}


}
public void muestra(int i){

System.out.println("El valor de la posicion i: " +i+" Es X: "+v[i].getX()+" Y: "+v[i].getY());

}

}