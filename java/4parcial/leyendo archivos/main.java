import java.io.FileReader;
import java.io.BufferedReader;
public class main{
public static void main(String[]args){
try{
FileReader fr=new FileReader("texto.txt");
BufferedReader br=new BufferedReader(fr);
String cadena;
//int numero;


//while((numero=br.read())!=-1){
	while((cadena=br.readLine())!=null){
//System.out.println(""+(char)numero);
System.out.println(""+cadena);
}
}catch(Exception e){
System.out.println("Ha habido un  error");
}
}

}