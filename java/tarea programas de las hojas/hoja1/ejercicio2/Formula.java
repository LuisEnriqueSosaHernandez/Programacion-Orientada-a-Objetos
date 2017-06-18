public class Formula{
int a=6;
int b=7;
int x;
int y;
int r;

public void setX(int x){
this.x=x;
}
public int getX(){
return x;
}

public void setY(int y){
this.y=y;
}
public int getY(){
return y;
}

public void setR(int r){
this.r=r;
}
public int getR(){
return r;
}

public int Resultado(){
r=(a*x)-(b*y);
System.out.println("El resultado de la formula es: "+r);
return r;
}



}