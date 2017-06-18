public class Tabla{
int Nt;
int R;


public void setNt(int Nt){
this.Nt=Nt;
}
public int getNt(){
return Nt;
}

public void setR(int R){
this.R=R;
}
public int getR(){
return R;
}
public int Multiplica(){
for(int n=1;n<=10;n++){
R=Nt*n;
System.out.println(Nt+" * "+n+" = "+R);
}
return R;

}

}