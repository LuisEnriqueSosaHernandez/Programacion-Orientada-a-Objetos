class ConoTruncado{
double r;
double ra;
double h;
double g;
double al;
double at;
double v;

public void setR(double r){
this.r=r;
}
public double getR(){
return r;
}

public void setRa(double ra){
this.ra=ra;
}
public double getRa(){
return ra;
}

public void setH(double h){
this.h=h;
}
public double getH(){
return h;
}
public void setG(double g){
this.g=g;
}
public double getg(){
return g;
}
public void setAl(double al){
this.al=al;
}
public double getAl(){
return al;
}
public void setAt(double at){
this.at=at;
}
public double getAt(){
return at;
}
public void setV(double v){
this.v=v;
}
public double getV(){
return v;
}


public double CalculaGeneratriz(){
g=Math.pow(h, 2)+Math.pow(ra-r, 2);
g=Math.sqrt(g);
return g;
}

public double CalculaAreaLateral(){
al=(3.1416*(ra+r)*g);
return al;
}

public double CalculaAreaTotal(){
at=3.1416*(g*(ra+r)+Math.pow(ra, 2)+Math.pow(r, 2));
return at;
}

public double CalculaVolumen(){
v=1.047*h*(Math.pow(ra, 2)+Math.pow(r, 2)+ra*r);
return v;
}
}





