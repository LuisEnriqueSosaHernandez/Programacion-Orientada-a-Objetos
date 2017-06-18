import java.io.*;
import java.io.File;
import java.util.Scanner;
 
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
            File fichero = new File("agenda.txt");
            if (!fichero.exists()) {
                lista = new Amigos();
                System.out.println("Agenda nueva");
            } else {
                ois = new ObjectInputStream(new FileInputStream("agenda.txt"));
                lista = (Amigos) ois.readObject();
                System.out.println("Ya existe una agenda");
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
                System.out.println("---------MENU------");
                System.out.println("1. Agregar Registros o editar registros");
                System.out.println("2. Eliminar Registros");
                System.out.println("3. Ver registro");
				 System.out.println("4. Ver todos los registros");
                System.out.println("5. Salir del Programa");
                System.out.println();
                System.out.print("Que quieres hacer?: ");
                do {
					
                    opcion = Short.parseShort(new BufferedReader(
                            new InputStreamReader(System.in)).readLine());
							if(opcion<1||opcion>5){
								System.out.println("INGRESA UNA OPCION CORRECTA");
								 System.out.println("---------MENU------");
                System.out.println("1. Agregar Registros o editar registros");
                System.out.println("2. Eliminar Registros");
                System.out.println("3. Ver registro");
				 System.out.println("4. Ver todos los registros");
                System.out.println("5. Salir del Programa");
                System.out.println();
                System.out.print("Que quieres hacer?: ");
							}
                } while (opcion < 1 || opcion > 5);
 
   switch (opcion) 
   {
case 1:
 
  do {
     error = false;
     try {
       System.out.print("Ingresa su posicion en la agenda: ");
       codigo = Integer.parseInt(br.readLine());
 
         } catch (NumberFormatException ne) 
           {
           System.out.println("Error*** valor incorrecto" + " (Solo numeros)");
          error = true;
           }
           } while (error);
            System.out.print("Nombre: ");
            nombre = br.readLine();
 
   do {
      error = false;
      try {
         System.out.print("Apellidos: ");
         apellido = br.readLine();
          } catch (NumberFormatException ne)
          {
         System.out.println("Error*****" + " (Solo Numeros)");
           error = true;
          }
        } while (error);
         System.out.print("Numero telefonico: ");
         numtel =(br.readLine());
 
    lista.agregar(new Amigo(codigo, nombre, apellido, numtel));
         cambios = true;
         break;
     case 2:
    do {
       error = false;
       try {
       System.out.print("Posicion en la agenda que quieras borrar: ");
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
    System.out.print("Ingrese el numero que tiene o tendra en la agenda: ");
    codigo = Short.parseShort(br.readLine());
        } catch (NumberFormatException ne)
        {
         System.out.println("Error*****" + " (Solo Numeros)");
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
   }   
            } while (opcion != 5);
        } catch (IOException e) {
        }
    }
	
    public static void escribir() 
    {
      ObjectOutputStream ous = null;
 
     try {
      if (cambios) 
      {
        ous = new ObjectOutputStream(new FileOutputStream("agenda.txt"));
        ous.writeObject(lista);
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
		File fichero = new File("agenda.txt");
			    if (fichero.delete()){
       System.out.println("El fichero ha sido borrado satisfactoriamente");
				}
    else{
				
       System.out.println("El fichero no puede ser borrado por que no existe");
				}
	}
}
