public class Conversor{
private double f;
private double k;
private int c,b;
public void setC(int c){
this.c=c;
}
public void setB(int b){
this.b=b;
}
int x=c;
int y=c;
public Double Convierte(){
System.out.print("\nGrados Farenheith\n");
for(int x=c;x<b;x++){
f=(x*1.8)+32;
System.out.println(f);
}
return f;
}
public Double Convierte2(){
System.out.print("\nGrados Kelvin\n");
for(int y=c;y<b;y++){
k=y+273.15;
System.out.println(k);
}
return k;
}


}