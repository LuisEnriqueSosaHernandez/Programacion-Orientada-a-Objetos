import java.util.Random;
public class Personaje{
private int salud,fisico,fuerza,ph,nivel;
private String nombre;
private Random rand=new Random(System.nanoTime());

public void setSalud(int salud){
this.salud=salud;
}
public int getSalud(){
return salud;
}

public void setFisico(int fisico){
this.fisico=fisico;
}
public int getFisico(){
return fisico;
}

public void setFuerza(int fuerza){
this.fuerza=fuerza;
}
public int getFuerza(){
return fuerza;
}

public void setPh(int ph){
this.ph=ph;
}
public int getPh(){
return ph;
}

public void setNivel(int nivel){
this.nivel=nivel;
}
public int getNivel(){
return nivel;
}

public void setNombre(String nombre){
this.nombre=nombre;
}
public String getNombre(){
return nombre;
}
//ataques

public int ataque_fisico(){
int aleatorio=rand.nextInt(2);
return nivel*fisico*aleatorio;

}

public int ataque_fuerza(){
if(ph>0){
ph--;
return nivel*fuerza;
}
else{
return 0;
}

}

public void dano(int salud){
this.salud-=salud;
}






}