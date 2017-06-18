import java.io.*;
 
public class Manejo_Archivos_Proyecto{
static Empleados lista = null;
    //si la lista sufre cambios se escribe en el discoASWS
    static boolean cambios;
 
    public static void main(String[] args) {
        leer();
        operaciones();
        escribir();
    }
 
    public static void leer() {
        ObjectInputStream ois = null;
        try {    /* Creaci&#65533;n considera dos casos si el archivo existe previamente
            o no */
            File fichero = new File("empresa.txt");
            if (!fichero.exists()) {
                lista = new Empleados();
                System.out.println("Archivo Nuevo");
            } else {
                ois = new ObjectInputStream(new FileInputStream("empresa.txt"));
                lista = (Empleados) ois.readObject();
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
        // short edad = 0;
        String nombre, apellido = null;
        int nihss;
        boolean eliminado = false;
        boolean error;
 
        // Mantenimiento
        try {
            do {
                System.out.println("MENu");
                System.out.println("1. Agregar Registros");
                System.out.println("2. Eliminar Registros");
                System.out.println("3. Ver registros");
                System.out.println("4. Salir del Programa");
                System.out.println();
                System.out.print("Tu opcion fue-->   ");
                do {
                    opcion = Short.parseShort(new BufferedReader(
                            new InputStreamReader(System.in)).readLine());
                } while (opcion < 1 || opcion > 4);
 
   switch (opcion) 
   {
///////////////////////////////////////////////////
       /* Agregar Registros */
case 1:
 
  do {
     error = false;
     try {
       System.out.print("Ingresa su ID:    ");
       codigo = Integer.parseInt(br.readLine());
 
         } catch (NumberFormatException ne) 
           {
           System.out.println("Error*** valor incorrecto" + " (Solo numeros)");
          error = true;
           }
           } while (error);
            System.out.print("Nombres:    ");
            nombre = br.readLine();
 
   do {
      error = false;
      try {
         System.out.print("Apellidos:      ");
         apellido = br.readLine();
          } catch (NumberFormatException ne)
          {
         System.out.println("Error*****" + " (Solo Numeros)");
           error = true;
          }
        } while (error);
         System.out.print("Matricula: ");
         nihss = Integer.parseInt(br.readLine());
 
    lista.agregar(new Empleado(codigo, nombre, apellido, nihss));
         cambios = true;
         break;





 ////////////////////////////////////
        /*  Eliminar registros */
     case 2:
    do {
       error = false;
       try {
       System.out.print("Id del Registro ma Borrar: ");
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
 ///////////////////////////////////////////
         /* Ver registros */
case 3: 
    do {
   error = false;
   try {
    System.out.print("Ingrese el ID para Buscar");
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
///////////////////////////////////////////////
    /*Salir*/
      case 4:
                }
            } while (opcion != 4);
        } catch (IOException e) {
        }
    }
/////////////////////////////////////////
    /* Funciones*/
    public static void escribir() 
    {
      ObjectOutputStream ous = null;
 
     try {
      if (cambios) 
      {
        ous = new ObjectOutputStream(new FileOutputStream("empresa.txt"));
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
}
