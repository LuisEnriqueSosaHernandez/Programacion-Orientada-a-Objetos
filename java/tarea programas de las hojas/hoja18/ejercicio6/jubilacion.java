public class jubilacion{
int edad;
int antiguedad;
String clasificacion;
public void setEdad(int edad){
this.edad=edad;
}
public void setAntiguedad(int antiguedad){
this.antiguedad=antiguedad;
}
public String devolver(){
if(edad>60&&antiguedad<25){
clasificacion="EDAD";
}
if(edad<60&&antiguedad>25){
clasificacion="JOVEN";
}
if(edad>60&&antiguedad>25){
clasificacion="ADULTA";
}
return clasificacion;
}

}