import javax.swing.JOptionPane;//GUARDADO DE LOS REGISTROS
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class Guardado{
String nombre,apellidos,tel,numregistro;
public void setNumregistro(String numregistro){
this.numregistro=numregistro;
}
public void setNombre(String nombre){//METODOS PARA RECIBIR LOS ATRIBUTOS
this.nombre=nombre;
}
public void setApellidos(String apellidos){
this.apellidos=apellidos;
}

public void setTel(String tel){
this.tel=tel;
}

public void guardado(){
try{
	
FileWriter ruta = new FileWriter("registros/"+numregistro+".txt");//ESCRITURA DEL ARCHIVO
PrintWriter guardado = new PrintWriter(ruta);
guardado.print(nombre);
guardado.print(" ");
guardado.print(apellidos);
guardado.print(" ");
guardado.print(tel);
guardado.close();
}catch(IOException e){
System.out.println("Ha ocurrido un error");//COMPROBACION DE ERRORES EN ESCRITURA
}

}
}