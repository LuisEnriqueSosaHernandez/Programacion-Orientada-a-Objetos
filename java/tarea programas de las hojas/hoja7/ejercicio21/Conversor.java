public class Conversor{
private double f;
private double k;
private int c;
public Double Convierte(){
System.out.print("\nGrados Farenheith\n");
for(c=-15;c<51;c++){
f=(c*1.8)+32;
System.out.println(f);
}
return f;
}
public Double Convierte2(){
System.out.print("\nGrados Kelvin\n");
for(c=-15;c<51;c++){
k=c+273.15;
System.out.println(k);
}
return k;
}


}