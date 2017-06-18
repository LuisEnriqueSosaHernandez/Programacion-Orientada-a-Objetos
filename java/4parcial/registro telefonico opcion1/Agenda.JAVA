import java.io.*;
import java.io.File;
import java.util.Scanner;

import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
 
 
public class Agenda{
static Amigos lista = null;


    
    static boolean cambios;
 
    public static void main(String[] args) {
		
		Scanner l=new Scanner(System.in);
		System.out.println("Deseas Eliminar la agenda anterior en caso de que exista?: ");
		String respuesta=l.next();
		if(respuesta.equals("si")||respuesta.equals("SI")||respuesta.equals("Si")){
		eliminar();
		}
        leer();
        operaciones();
        escribir();
    }
 
    public static void leer() {
        ObjectInputStream ois = null;
        try {    
           
            File fichero = new File("Agenda.txt");
            if (!fichero.exists()) {
                lista = new Amigos();
                System.out.println("Archivo Nuevo");
            } else {
                ois = new ObjectInputStream(new FileInputStream("Agenda.txt"));
                lista = (Amigos) ois.readObject();
                System.out.println("Ya existe");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error: " + e.toString());
        } catch (IOException e) {
            System.out.println("Error: " + e.toString());
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
            }
        }
    }
 
    public static void operaciones() {
        short opcion = 0;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
 
        int posi = -1;
        int codigo = 0;
        
        String nombre, apellido = null;
        String numtel;
        boolean eliminado = false;
        boolean error;
 
        
        try {
            do {
				do{
				error=false;
				try{
                System.out.println("---------MENU------");
                System.out.println("1. Agregar Registros");
                System.out.println("2. Eliminar Registro");
                System.out.println("3. Ver registro");
                System.out.println("4. Ver todos los registros");
				System.out.println("5. Escribir una nota");
				System.out.println("6. Leer una nota");
				System.out.println("7. Editar un registro");
				System.out.println("8. Salir");
                System.out.println();
                System.out.print("Que quieres hacer?: ");
				}catch (NumberFormatException ne) 
           {
           System.out.println("Error*** valor incorrecto" + " (Solo numeros)");
          error = true;
           }
           } while (error);
                do {
					do{
						error=false;
						try{
                    opcion = Short.parseShort(new BufferedReader(
                            new InputStreamReader(System.in)).readLine());
							if(opcion<1||opcion>7){
								System.out.println("INGRESA UNA OPCION CORRECTA");
								 System.out.println("---------MENU------");
                System.out.println("1. Agregar Registros");
                System.out.println("2. Eliminar Registro");
                System.out.println("3. Ver registro");
				 System.out.println("4. Ver todos los registros");
                System.out.println("5. Escribir una nota");
				System.out.println("6. Leer una nota");
				System.out.println("7. Editar un registro");
				System.out.println("8. Salir del Programa");
                System.out.println();
                System.out.print("Que quieres hacer?: ");
							}
						}catch (NumberFormatException ne) 
           {
           System.out.println("Error*** valor incorrecto" + " (Solo numeros)");
          error = true;
           }
           } while (error);
					
				
                } while (opcion < 1 || opcion > 8);
 
   switch (opcion) 
   {

case 1:
 
  do {
     error = false;
     try {
       System.out.print("Ingrese el numero de amigo: ");
       codigo = Integer.parseInt(br.readLine());
  } catch (NumberFormatException ne) 
           {
           System.out.println("Error*** valor incorrecto" + " (Solo numeros)");
          error = true;
           }
           } while (error);
		   
            System.out.print("Nombre: ");
            nombre = br.readLine();
			while(nombre.equals("")){
				System.out.print("Ingresa el Nombre: ");
            nombre = br.readLine();
			}
 
   do {
      error = false;
      try {
         System.out.print("Apellido: ");
         apellido = br.readLine();
		 while(apellido.equals("")){
			System.out.print("Ingresa el Apellido: ");
         apellido = br.readLine(); 
		 }
          } catch (NumberFormatException ne)
          {
         
           error = true;
          }
        } while (error);
         System.out.print("Numero telefonico: ");
         numtel = br.readLine();
		 while(numtel.equals("")){
			System.out.print("Ingresa el Numero telefonico: ");
         numtel = br.readLine(); 
		 }
 
    lista.agregar(new Amigo(codigo, nombre, apellido, numtel));
         cambios = true;
         break;






     case 2:
    do {
       error = false;
       try {
       System.out.print("Que amigo deseas borrar: ");
       codigo = Short.parseShort(br.readLine());
           } catch (NumberFormatException ne)
           {
           System.out.println("Error***" + " (Solo Numeros)");
           error = true;
           }
        } while (error);
        eliminado = lista.eliminar(codigo);
      if (eliminado)
      {
     System.out.println("Registro eliminado del archivo");
       cambios = true;
      } else if (lista.longitud() != 0)
      {
      System.out.println("No se Encuentra");
      } else 
      {
      System.out.println("Archivo vacio");
      }
      break;
 
case 3: 
    do {
   error = false;
   try {
    System.out.print("Ingrese el numero de amigo que desea buscar: ");
    codigo = Short.parseShort(br.readLine());
        } catch (NumberFormatException ne)
        {
         System.out.println("Solo se admiten numeros");
          error = true;
        }
        } while (error);
           posi = lista.buscar(codigo);
           if (posi == -1) {
           if (lista.longitud() != 0)
           {
          System.out.println("No se Encuentra");
           } else {
          System.out.println("Archivo vacio");
                  }
                           } 
           else {
                 lista.elemento(posi).mostrar();
                }
                break;
				case 4: 
   error = false;
           if (lista.longitud() != 0)
           {
          System.out.println("Tus amigos en la agenda son :");
           } else {
          System.out.println("Archivo vacio");
                  }
                          
           for(int i=0;i<lista.longitud();i++){
                 lista.elemento(i).mostrar();
				 System.out.println("");
		   }
                break;
				case 5:
				Scanner l=new Scanner(System.in);
try{
	System.out.println("Nombre para la nota: ");
	String ruta=l.next();
	while(ruta.equals("")){
		System.out.println("Escribe un numero para la nota: ");
		ruta=l.next();
	}
	
	ruta=ruta+".txt";
	System.out.println("Texto para la nota: ");
	String nota=l.nextLine();
	while(nota.equals("")){
		nota=l.nextLine();
	}
FileWriter guardado = new FileWriter(ruta);
PrintWriter escribir = new PrintWriter(guardado);
escribir.print(nota);
escribir.print(" ");
escribir.close();
}catch(IOException e){
JOptionPane.showInputDialog( null , "Error \n" + e);
}

				break;
				case 6:
				Scanner t=new Scanner(System.in);
				System.out.println("Que nota deseas leer: ");
String leer=t.nextLine();
				try{
FileReader fr=new FileReader(leer+".txt");
BufferedReader z=new BufferedReader(fr);
String cadena;
System.out.println("El contenido de la nota: ");
while((cadena=z.readLine())!=null){
System.out.println(""+cadena);
}
}catch(Exception e){
System.out.println("Ha habido un  error");
}

				break;

      case 7:
	   try {
            do {
				do{
				error=false;
				try{
                 System.out.println("1. Editar nombre");
                System.out.println("2. Editar Apellidos");
                System.out.println("3. Editar Numero telefonico");
				 System.out.println("4. Editar todo");
                System.out.println("5. Terminar edicion");
                System.out.println();
                System.out.print("Que quieres hacer?: ");
				}catch (NumberFormatException ne) 
           {
           System.out.println("Error*** valor incorrecto" + " (Solo numeros)");
          error = true;
           }
           } while (error);
                do {
					do{
						error=false;
						try{
                    opcion = Short.parseShort(new BufferedReader(
                            new InputStreamReader(System.in)).readLine());
							if(opcion<1||opcion>5){
								System.out.println("INGRESA UNA OPCION CORRECTA");
								 System.out.println("---------MENU------");
                System.out.println("1. Editar nombre");
                System.out.println("2. Editar Apellidos");
                System.out.println("3. Editar Numero telefonico");
				 System.out.println("4. Editar todo");
                System.out.println("5. Cancelar");
                System.out.println();
                System.out.print("Que quieres hacer?: ");
							}
						}catch (NumberFormatException ne) 
           {
           System.out.println("Error*** valor incorrecto" + " (Solo numeros)");
          error = true;
           }
           } while (error);
					
				
                } while (opcion < 1 || opcion > 5);
 
   switch (opcion) 
   {

case 1:
  do {
   error = false;
   try {
    System.out.print("Ingrese el numero de amigo a editar: ");
    codigo = Short.parseShort(br.readLine());
        } catch (NumberFormatException ne)
        {
         System.out.println("Solo se admiten numeros");
          error = true;
        }
        } while (error);
           posi = lista.buscar(codigo);
           if (posi == -1) {
           if (lista.longitud() != 0)
           {
          System.out.println("No se Encuentra");
           } else {
          System.out.println("Archivo vacio");
                  }
                           } 
           else {
			   System.out.print("Nombre: ");
            nombre = br.readLine();
			while(nombre.equals("")){
				System.out.print("Ingresa el Nombre: ");
            nombre = br.readLine();
			}
			   lista.agregar(new Amigo(lista.elemento(posi).getCodigoAmigo(), nombre,lista.elemento(posi).getApellido(), lista.elemento(posi).getNumtel()));
         cambios = true;
                }
break;
case 2:
 do {
   error = false;
   try {
    System.out.print("Ingrese el numero de amigo a editar: ");
    codigo = Short.parseShort(br.readLine());
        } catch (NumberFormatException ne)
        {
         System.out.println("Solo se admiten numeros");
          error = true;
        }
        } while (error);
           posi = lista.buscar(codigo);
           if (posi == -1) {
           if (lista.longitud() != 0)
           {
          System.out.println("No se Encuentra");
           } else {
          System.out.println("Archivo vacio");
                  }
                           } 
           else {
			  System.out.print("Apellido: ");
         apellido = br.readLine();
		 while(apellido.equals("")){
			System.out.print("Ingresa el Apellido: ");
         apellido = br.readLine(); 
		 }
			   lista.agregar(new Amigo(lista.elemento(posi).getCodigoAmigo(), lista.elemento(posi).getNombre(),apellido, lista.elemento(posi).getNumtel()));
         cambios = true;
                }
break;
case 3:
 do {
   error = false;
   try {
    System.out.print("Ingrese el numero de amigo a editar: ");
    codigo = Short.parseShort(br.readLine());
        } catch (NumberFormatException ne)
        {
         System.out.println("Solo se admiten numeros");
          error = true;
        }
        } while (error);
           posi = lista.buscar(codigo);
           if (posi == -1) {
           if (lista.longitud() != 0)
           {
          System.out.println("No se Encuentra");
           } else {
          System.out.println("Archivo vacio");
                  }
                           } 
           else {
			 System.out.print("Numero telefonico: ");
         numtel = br.readLine();
		 while(numtel.equals("")){
			System.out.print("Ingresa el Numero telefonico: ");
         numtel = br.readLine(); 
		 }
			   lista.agregar(new Amigo(lista.elemento(posi).getCodigoAmigo(), lista.elemento(posi).getNombre(),lista.elemento(posi).getApellido(),numtel));
         cambios = true;
                }
break;
 case 4:
 
  do {
     error = false;
     try {
       System.out.print("Ingrese el numero de amigo a editar: ");
       codigo = Integer.parseInt(br.readLine());
  } catch (NumberFormatException ne) 
           {
           System.out.println("Error*** valor incorrecto" + " (Solo numeros)");
          error = true;
           }
           } while (error);
		   
            System.out.print("Nombre: ");
            nombre = br.readLine();
			while(nombre.equals("")){
				System.out.print("Ingresa el Nombre: ");
            nombre = br.readLine();
			}
 
   do {
      error = false;
      try {
         System.out.print("Apellido: ");
         apellido = br.readLine();
		 while(apellido.equals("")){
			System.out.print("Ingresa el Apellido: ");
         apellido = br.readLine(); 
		 }
          } catch (NumberFormatException ne)
          {
         
           error = true;
          }
        } while (error);
         System.out.print("Numero telefonico: ");
         numtel = br.readLine();
		 while(numtel.equals("")){
			System.out.print("Ingresa el Numero telefonico: ");
         numtel = br.readLine(); 
		 }
		 
    lista.agregar(new Amigo(lista.elemento(posi).getCodigoAmigo(), nombre, apellido, numtel));
         cambios = true;
		 break;
	         }
            } while (opcion != 5);
        } catch (IOException e) {
        }
	  break;
                }
            } while (opcion != 8);
        } catch (IOException e) {
        }
    }

    public static void escribir() 
    {
      ObjectOutputStream ous = null;
 
     try {
      if (cambios) 
      {
        ous = new ObjectOutputStream(new FileOutputStream("Agenda.txt"));
        ous.writeObject(lista);
		System.out.println("Agenda actualizada");
      }
       lista = null;
        } catch (IOException e)
        {
            System.out.println("Error: " + e.toString());
        } finally 
     {
       try {
           if (ous != null) 
           {
           ous.close();
           }
            } catch (IOException e) 
            {
            }
        }
    }
	public static void eliminar(){
		File fichero = new File("Agenda.txt");
			    if (fichero.delete()){
       System.out.println("El fichero ha sido borrado satisfactoriamente");
				}
    else{
				
       System.out.println("El fichero no puede ser borrado por que no existe");
				}
	}
}
