public class Arreglo{
int[]v={1,2,3,4,5,6,7,8,9,10};

int a,i;

public void setA(int a){
this.a=a;

}
public int getA(){
return a;
}
public void Busca(){
for(i=0;i<v.length;i++){
if(a==v[i]){
System.out.print(i);
}
}
if(i==v.length)
System.out.println("NO EXISTE EL VALOR EN EL ARREGLO");



}


}