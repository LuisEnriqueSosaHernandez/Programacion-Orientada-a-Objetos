class Tablademultiplicar{
int num;
int i;
int n;

public void setNum(int num){
this. num = num;
}
public int getNum(){
return num;
}

public void Calculatabla(){


for(n=1;n<=10;n++)
{
i=num*n;
System.out.println(num + " x " + n + " = " + i);
}
}
}