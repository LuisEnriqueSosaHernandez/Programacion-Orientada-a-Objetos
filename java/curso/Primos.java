
public class Primos{
public static void main(String[]arg){
boolean resultado=true;
for(int i=1;i<200;i++){
resultado=true;
for(int j=2;j<i&&resultado;j++){
if(i%j==0){
resultado=false;
}
}
if(resultado){
System.out.print(i+" ");

}
}
}
}

