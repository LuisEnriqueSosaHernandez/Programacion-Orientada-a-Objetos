public class Compara{
public static void main(String[]arg){
int[]v1={4,5,6,7,8};
int[]v2={4,5,6,7,8};
boolean iguales=true;
if(v1.length!=v2.length){

iguales=false;

}

for(int i=0;i<v1.length&&iguales;i++){

if(v1[i]!=v2[i]){

iguales=false;

}

}
if(iguales){
System.out.print("Ambos vectores son iguales");

}
else{
System.out.print("Ambos vectores no son iguales");
}

}


}