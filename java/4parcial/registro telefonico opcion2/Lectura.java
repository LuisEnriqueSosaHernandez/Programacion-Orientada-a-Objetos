import java.io.FileReader;
import java.io.BufferedReader;
public class Lectura{
	String ruta;
	public void setRuta(String ruta){
		this.ruta=ruta;
	}
public void leer(){
try{
	
FileReader fr=new FileReader("registros/"+ruta+".txt");//LECTURA DEL ARCHIVO
BufferedReader br=new BufferedReader(fr);
String cadena;
while((cadena=br.readLine())!=null){
System.out.println(""+cadena);
}
}catch(Exception e){//COMPROBACION DE ERRORES POR SI EL ARCHIVO NO EXISTE
	
System.out.println("El registro no existe");

}
}
}

