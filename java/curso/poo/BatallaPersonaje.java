import java.util.Random;
public class BatallaPersonaje{
public static void main(String[]arg){
boolean jedi=true,sith=true;
int aleatorio,salud;
Personaje luke=new Personaje();
Personaje yoda=new Personaje();
Personaje darth_vader=new Personaje();
Random rand=new Random(System.nanoTime());

luke.setFisico(15);
luke.setFuerza(10);
luke.setNivel(2);
luke.setNombre("Luke");
luke.setPh(2);
luke.setSalud(300);

darth_vader.setFisico(10);
darth_vader.setFuerza(40);
darth_vader.setNivel(5);
darth_vader.setNombre("Darth Vader");
darth_vader.setPh(4);
darth_vader.setSalud(500);

yoda.setFisico(5);
yoda.setFuerza(60);
yoda.setNivel(10);
yoda.setNombre("Yoda");
yoda.setPh(10);
yoda.setSalud(200);

System.out.println(luke.getNombre()+" tiene una vida de: "+luke.getSalud()); 
System.out.println(darth_vader.getNombre()+" tiene una vida de: "+darth_vader.getSalud());
System.out.println(yoda.getNombre()+" tiene una vida de: "+yoda.getSalud());
System.out.println();
System.out.println();

do{
aleatorio=rand.nextInt(1);
if(aleatorio==0){
salud=luke.ataque_fisico();
}
else{
salud=luke.ataque_fuerza();
}
System.out.println(luke.getNombre()+" Ha realizado un ataque de: "+salud);
darth_vader.dano(salud);

aleatorio=rand.nextInt(1);
if(aleatorio==0){
salud=yoda.ataque_fisico();
}
else{
salud=yoda.ataque_fuerza();
}
System.out.println(yoda.getNombre()+" Ha realizado un ataque de: "+salud);
darth_vader.dano(salud);

if(darth_vader.getSalud()>0){
aleatorio=rand.nextInt(1);
if(aleatorio==0){
salud=darth_vader.ataque_fisico();
}
else{
salud=darth_vader.ataque_fuerza();
}
System.out.println(darth_vader.getNombre()+" Ha realizado un ataque de: "+salud);
aleatorio=rand.nextInt(1);
if(aleatorio==0){
luke.dano(salud);
}
else{
yoda.dano(salud);
}
if(luke.getSalud()<=0&&yoda.getSalud()<=0){
jedi=false;
}
}
else{
sith=false;
}
System.out.println(luke.getNombre()+" tiene una vida de: "+luke.getSalud()); 
System.out.println(darth_vader.getNombre()+" tiene una vida de: "+darth_vader.getSalud());
System.out.println(yoda.getNombre()+" tiene una vida de: "+yoda.getSalud());
System.out.println();
System.out.println();
try{
System.in.read();
}catch(Exception e){} 
}while(jedi&&sith);


}

}

