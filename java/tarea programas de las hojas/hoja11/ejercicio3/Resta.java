public class Resta{
private int numa;
private int numb;
private int numc;

public void setNuma(int numa){
this.numa=numa;
}
public void setNumb(int numb){
this.numb=numb;
}
public void setNumc(int numc){
this.numc=numc;
}

public int regresa1(){
numc=numa-numb;
return numc;
}
public int regresa2(){
numa=numa;
return numa;
}
public int regresa3(){
numb=numb+numc;
return numb;
}
}



