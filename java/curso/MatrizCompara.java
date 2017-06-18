import java.util.Scanner;
public class Matrizcompara{
public static void main(String[]arg){
Scanner Lee=new Scanner(System.in);

int a,b,cont=1;
boolean igual=true;
System.out.print("Un valor para a: ");
a=Lee.nextInt();
System.out.print("Un valor para b: ");
b=Lee.nextInt();
int[][]m1={
{1,2,3},
{4,5,6},
{7,8,9}

};

int[][]m2= new int[a][b];

for(int i=0;i<m2.length;i++){
for(int j=0;j<m2[0].length;j++){
m2[i][j]=cont;
cont++;

}


}
if(m1.length==m2.length){
if(m1[0].length==m2[0].length){
for(int i=0;i<m1.length&&igual;i++){
for(int j=0;j<m1[0].length&&igual;j++){

if(m1[i][j]!=m2[i][j]){

igual=false;


}

}

}

}
else{

igual=false;

}


}
else{
 igual=false;
}
if(igual){
System.out.print("Ambas son iguales");
}
else{
System.out.print("No son iguales");
}
}
}