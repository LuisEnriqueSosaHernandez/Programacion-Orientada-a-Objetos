public class NoSindicalizado extends Sueldo{
protected int anos;
public void setAnos(int anos){
	this.anos=anos;
}
public double calculasueldo(){
if(anos<1){
sueldo=sueldo;
}
if(anos==1){
sueldo=sueldo+sueldo*.01;
}
if(anos==2){
sueldo=sueldo+sueldo*.02;
}
if(anos==3){
sueldo=sueldo+sueldo*.03;
}
if(anos==4){
sueldo=sueldo+sueldo*.04;
}
if(anos==5){
sueldo=sueldo+sueldo*.05;
}
if(anos==6){
sueldo=sueldo+sueldo*.06;
}
if(anos==7){
sueldo=sueldo+sueldo*.07;
}
if(anos==8){
sueldo=sueldo+sueldo*.08;
}
if(anos==9){
sueldo=sueldo+sueldo*.09;
}
if(anos==10){
sueldo=sueldo+sueldo*.10;
}
if(anos==11){
sueldo=sueldo+sueldo*.11;
}
if(anos==12){
sueldo=sueldo+sueldo*.12;
}
if(anos==13){
sueldo=sueldo+sueldo*.13;
}
if(anos==14){
sueldo=sueldo+sueldo*.14;
}
if(anos==15){
sueldo=sueldo+sueldo*.15;
}
if(anos>15){
sueldo=sueldo+sueldo*.15;
}
return sueldo;
}

}