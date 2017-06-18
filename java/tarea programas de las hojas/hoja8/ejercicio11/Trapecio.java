class Trapecio{
double basemayor;
double basemenor;
double ladoa;
double ladoc;
double ladob;
double area;
double perimetro;

public void setArea(double area){
this.area=area;
}
public double getArea(){
return area;
}
public void setPerimetro(double perimetro){
this.perimetro=perimetro;
}
public double getPerimetro(){
return perimetro;
}
public void setBasemayor(double basemayor){
this.basemayor=basemayor;
}
public double getBasemayor(){
return basemayor;
}
public void setBasemenor(double basemenor){
this.basemenor=basemenor;
}
public double geBasemenor(){
return basemenor;
}
public void setLadoa(double ladoa){
this.ladoa=ladoa;
}
public double getLadoa(){
return ladoa;
}
public void setLadob(double ladob){
this.ladob=ladob;
}
public double getLadob(){
return ladob;
}
public void setLadoc(double ladoc){
this.ladoc=ladoc;
}
public double getLadoc(){
return ladoc;
}

public double Calculabasemayor(){
basemayor=(Math.sqrt((ladoc * ladoc)-(ladob * ladob)));
return basemayor;
}

public double Calculabasemenor(){ 
basemenor=ladoa-basemayor;
return basemenor;
}

public double Calculaarea(){
area=(ladob+basemenor)*(ladob)/2;
return area;
}
public double Calculaperimetro(){
perimetro=ladoa+ladob+ladoc+basemenor;
return perimetro;
}
}




