import java.util.Scanner;//LIBRERIAS PARA ENTRADA Y SALIDA 
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class Agenda{
static Persona p=new Persona();
    public void guardado(){
try{
	
FileWriter ruta = new FileWriter("registros/"+p.getNumregistro()+".txt");//ESCRITURA DEL ARCHIVO
PrintWriter guardado = new PrintWriter(ruta);
guardado.print("\n");
guardado.print("Nombre:\n ");
guardado.print(p.getNombre());
guardado.print("\n");
guardado.print("Direccion: \n");
guardado.print(p.getDireccion());
guardado.print("\n");
guardado.print("Email: \n");
guardado.print(p.getEmail());
guardado.print("\n");
guardado.print("Tel: \n");
guardado.print(p.getTel());
guardado.close();
}catch(IOException e){
System.out.println("Ha ocurrido un error");//COMPROBACION DE ERRORES EN ESCRITURA
}

}
    public void leer(String ruta){
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
    
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
Agenda ag=new Agenda();
	int a;
	do{//MENU DEL PROGRAMA
	System.out.println("---REGISTRO TELEFONICO---");
		System.out.println("");
		System.out.println("1.***Agregar o editar registros***");
		System.out.println("2.***Ver un registro***");
		System.out.println("3.***Ver todos los registros***");
		System.out.println("4.***Eliminar un registro***");
		System.out.println("5.***Salir del programa***");
		System.out.print("Decime la opcion e.e: ");
		a=Integer.parseInt(l.nextLine());
		System.out.println("");
	do{
		if(a<=0||a>5){
			System.out.println("---REGISTRO TELEFONICO---");
		System.out.println("");
			System.out.println("PROPORCIONA UNA OPCION CORRECTA");
			System.out.println("");
		System.out.println("1.***Agregar o editar registros***");
		System.out.println("2.***Ver un registro***");
		System.out.println("3.***Ver todos los registros***");
		System.out.println("4.***Eliminar un registro***");
		System.out.println("5.***Salir del programa***");
		System.out.print("Decime la opcion e.e: ");
		a=l.nextInt();
		System.out.println("");
		}
	}while(a<=0||a>5);
switch(a){
	case 1:

System.out.println("Numero de registro ");

p.setNumregistro(l.nextLine());//LECTURA DE LOS DATOS DEL REGISTRO

System.out.println("Nombre: ");
p.setNombre(l.nextLine());
System.out.println("Direccions: ");
p.setDireccion(l.nextLine());
System.out.println("Email: ");
p.setEmail(l.nextLine());
System.out.println("Numero telefonico: ");
p.setTel(l.nextLine());
ag.guardado();
System.out.println("");
break;
case 2:
System.out.println("Registro que desea buscar: ");//BUSCADO DE UN REGISTRO UNICO , en realidad busca el archivo 

String ruta=l.nextLine();

ag.leer(ruta);
System.out.println("");
break;
case 3:
for(int i=0;i<100;i++){	
try{
	String x =Integer.toString(i);//MOSTRAR TODOS LOS REGISTROS
FileReader fr=new FileReader("registros/"+x+".txt");
BufferedReader br=new BufferedReader(fr);
String cadena;
while((cadena=br.readLine())!=null){//RECORRE TODO EL ARCHIVO hasta que no existan mas lineas , de esa manera muestra todo los registros***	
System.out.println(""+cadena);
}
}catch(Exception e){//MANEJO DE ERRORES
}
}
System.out.println("");
break;
case 4:
System.out.println("Que registro desea eliminar: ");//PARA ELIMINAR UN REGISTRO
String b=l.nextLine();
File fichero = new File("registros/"+b+".txt");//Cada registro se guarda en un archivo unico , es un desperdicio de memoria xD pero se ve bonito
			    if (fichero.delete()){
       System.out.println("El fichero ha sido borrado satisfactoriamente");
				}
    else{
				
       System.out.println("El fichero no puede ser borrado por que no existe");
				}
	}
	}while(a!=5);
}
}
