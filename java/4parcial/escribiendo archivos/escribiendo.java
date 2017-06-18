
import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class escribiendo{
Scanner l=new Scanner(System.in);
String a;
String b;
String y="no";
public void setA(String a){
this.a=a;
}
public void setB(String b){
this.b=b;
}
String ruta="archivos/archivo.txt";

public void escribir(){
try{
	
FileWriter guardado = new FileWriter(ruta);
PrintWriter escribir = new PrintWriter(guardado);
escribir.print( a + " "+b);
escribir.print(" ");
escribir.close();
}catch(IOException e){
JOptionPane.showInputDialog( null , "Error \n" + e);
}

}
}