import java.util.Scanner;//LIBRERIAS PARA ENTRADA Y SALIDA 
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
public class Registro{
public static void main(String[]args){
	Scanner l=new Scanner(System.in);
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
		a=l.nextInt();
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
Guardado es=new Guardado();//USO DE LA CLASE GUARDADO
System.out.println("Numero de registro ");
l.nextLine();
es.setNumregistro(l.nextLine());//LECTURA DE LOS DATOS DEL REGISTRO

System.out.println("Nombre: ");
es.setNombre(l.nextLine());
System.out.println("Apellidos: ");
es.setApellidos(l.nextLine());
System.out.println("Numero telefonico: ");
es.setTel(l.nextLine());
es.guardado();
System.out.println("");
break;
case 2:
Lectura lec=new Lectura();//USO DE LA CLASE LECTURA
System.out.println("Registro que desea buscar: ");//BUSCADO DE UN REGISTRO UNICO , en realidad busca el archivo 
l.nextLine();
lec.setRuta(l.nextLine());

lec.leer();
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
l.nextLine();
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
