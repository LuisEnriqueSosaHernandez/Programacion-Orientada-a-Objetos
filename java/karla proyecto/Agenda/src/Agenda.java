import java.util.ArrayList;//UTILIZAMOS LAS LISTAS FAMOSAS DE JAVA PARA MAYOR FACILIDAD Y RENTABILIDAD, COMO DICEN ES MEJOR REUTILIZAR QUE CREAR O AL MENOS PARA LOS PROGRAMADORES RAPIDOS EN COMPETENCIAS
import java.util.Scanner;//IMPORTAMOS LA LIBRERIA DE JAVA PARA ENTRADA DE DATOS
public class Agenda {
    ArrayList <Persona> personas;//CREAMOS NUESTRA LISTA 
   static Scanner lee = new Scanner(System.in);//SCANNER PARA LECTURA DE DATOS, ES ESTATICO POR QUE NO ESTA DECLARADO DENTRO DEL MAIN , Y LE DAMOS LA LLAVE PARA QUE EL MAIN PUEDA ACCEDER A EL Y PODERLO UTILIZAR
    public Agenda(){//CONSTRUCTOR DE LA CLASE
        personas = new ArrayList<>();//INICILIZAMOS NUESTRA LISTA QUE ES DEL TIPO PERSONA
    }
    public static void main(String[] args){//MAIN DEL PROGRAMA AQUI ES DONDE SE EJECUTAN TODOS LOS PROCESOS
        Agenda registro = new Agenda ();//OBJETO PARA USAR METODOS DE LA CLASE
        
        int opc=0;//VARIABLE PARA USO DEL SWITCH
        do{//USO DEL DO WHILE, ESTRUCTURA MUY USADA PARA LA CREACION DE MENUS
            try{// ENVOLVEMOS NUESTRO MENU EN UN TRY CATCH PARA EL MANEJO DE ERRORES
            System.out.println("Menu Principal");//MENU DEL PROGRAMA
        System.out.println("1.- Agregar registro");
        System.out.println("2.- Mostrar todos los registros");
       System.out.println("3.- Buscar contacto");
        System.out.println("4.- Eliminar contacto");
        System.out.println("5.- Modificar contacto");
        System.out.println("6.- Finalizar programa");
        
        opc =Integer.parseInt(lee.nextLine());//NOS INCLINAMOS A HACER UN PARSEO PARA EVITA EL CLASICO ERROR DEL SALTO DE LINEA LA VHS BLURAY PAPU
            switch(opc){//USO DEL WITCH CASE, PARTE DEL MENU , INDICAMOS UN NUMERO Y ESTO REALIZA ALGUNA ACCION
                case 1:
                    registro.Registrarcontacto();//ACCEDEMOS AL METODO PARA REGISTAR CONTACTO
                    break;//SI NO ROMPEMOS EL CASO O LO DAMOS POR TERMINADO SUCEDEN ERRORES ESTA ES LA ESTRUCTURA DE UN CASE DE SWITCH
                case 2:
                    registro.Mostrarcontactos();//ACCEDEMOS AL METODO PARA MOSTRAR LOS CONTACTOS
                    break;
                    case 3:
                registro.Buscarcontacto();//ACCEDEMOS AL METODO PARA BUSCAR EL CONTACTO
                break;
                case 4:
                    registro.Eliminarcontacto();//ACCEDEMOS AL METODO PARA ELIMINAR UN CONTACTO
                break;
                case 5:
                registro.Editarcontacto();//ACCEDEMOS AL METODO PARA EDITAR UN CONTACTO
                break;
              
                case 6:
                    System.out.println("Programa finalizado");//MENSAJE DE PROGRAMA FINALIZADO, NO SIRVE DE NADA PERO SE VE BONITO
                    break;
                default:
                    System.out.println("Opcion fuera de rango");//MANEJAMOS EL DEFAULT , SE ENCUENTRA EN LA ESTRUCTURA DEL CASE, SIRVE PARA PONER UN MENSAJE AL USUARIO SI PONE UN NUMERO QUE NO SE ENCUENTRA EN EL MENU , ESTO CON EL FIN DE PROTEGER LA INTEGRIDAD DEL PROGRAMA
                    break;
            }
            }catch(NumberFormatException n){//MANEJO DE ERRORES, AQUI NOS MUESTRA UNA VARIABLE INUTILIZABLE, TOTAL MENTIRA, ES POR EL PARSEO QUE SE MANEJO ARRIBA PARA EVITAR LOS SALTOS DE LECTURA DE DATOS
              System.out.println("Error solo se admiten numeros");//MENSAJE DE LA ESTRUCTURA TRY CATCH
            }
        }while(opc!=6);
    }
    public void Registrarcontacto(){//METODO PARA INGRESAR LOS CONTACTOS A LA LISTA
        String nombre, direccion, email, telefono;//DECLARACION DE VARIABLES 
        System.out.println("\n Ingrese el nombre");
        nombre = lee.nextLine();//LECTURA DEL NOMBRE DEL REGISTRO
        System.out.println("\n Ingrese la direccion");
        direccion = lee.nextLine();//LECTURA DE LA DIRECCION
        System.out.println("\n Ingrese el email");
        email = lee.nextLine();//LECTURA DEL CORREO ELECTRONICO
        System.out.println("\n Ingrese el telefono");
        telefono = lee.nextLine();//LECTURA DEL NUMERO TELEFONICO, POR SI EN ALGUN FUTURO METEN LETRAS EN LOS NUMEROS TELEFONICOS NO HACEMOS ESA VALIDACION
        personas.add(new Persona(nombre,direccion,email,telefono));//AGREGAMOS A LA LISTA TODO EL OBJETO PERSONA  CON SUS RESPECTIVOS ATRIBUTOS QUE RECIBE EN EL CONTRUCTOR DE LA CLASE PERSONA 
    }
    public void Mostrarcontactos(){//METODO PARA MOSTRAR LOS CONTACTOS
        personas.stream().forEach((persona) -> {//RECORREMOS EL CICLO CON UN CICLO FOR EACH POCO CONOCIDO POR LOS NOOBS
            System.out.println(persona.toString());//IMPRIMOS GRACIAS AL METODO DE JAVA TOSTRING ACCEDIDO DESDE LA CLASE PERSONA
        });
    }
    
    public void Buscarcontacto(){//METODO PARA BUSCAR UN CONTACTO 
        String id;//EL ID EN REALIDAD ES EL NOMBRE , PERO CREAMOS OTRO CON FINES PRACTICOS, NOTESE QUE ESCRIBO EN PLURAL , PERO YOLO EN REALIDAD LO ESTOY HACIENDO SOLITO :C MAESTRA PASEME PLOX
        System.out.println("Introduce el nombre de la persona que deseas buscar:");
        id = lee.nextLine();//LEEMOS EL IDENTIFICADOR QUE POSTERIORME NOS SIRVE PARA ENCONTRAR EL REGISTRO, NO VALIDE EL HECHO DE QUE EL REGISTRO NO SE ENCUENTRE, PERO POR ENDE SI EL PROGRAMA NO REALIZA NADA SE DA POR ENTENDIDO QUE EL CONTACTO NO SE ENCUENTRA REGISTRADO
        
        personas.stream().filter((persona) -> (id.equals(persona.getNombre()))).forEach((persona) -> {//SE PUEDEN AGREGAR BUSQUEDAS PARCIALES EN COINCIDENCIA, PERO ESO ES UN POCO MAS AVANZADO
            System.out.println(persona.toString());//IMPRIMOS DE NUEVO GRACIAS AL METODO TOSTRING
        }); 
    }
    public void Eliminarcontacto(){//METODO PARA ELIMINAR UN CONTACTO
        String id;
        System.out.println("Introduce el nombre de la persona que deseas eliminar:");
        id= lee.nextLine();//INGRESAMOS EL NOMBRE DE LA PERSONA QUE NOS ROMPIO EL KOKORO Y LA QUEREMOS ELIMINAR
        
        for(int i=0;i<personas.size();i++){
            if(id.equals(personas.get(i).getNombre())){//BUSCAMOS EN TODO EL REGISTRO
                personas.remove(i);//ELIMINAMOS EL REGISTRO DE LA LISTA
                break;//SI LO ENCUENTRA CORTAMOS EL CICLO PARA EVITAR BUSQUEDAS INNCESARIAS , SE PUEDE DAR EL CASO DE QUE DOS PERSONAS TENGAN EL MISMO NOMBRE, PERO ESO NI LAS AGENDAS DE CELULAR LO VALIDAN
            }
        }
    }
    public void Editarcontacto(){//METODO PARA ELIMINAR CONTACTO
            
        String id;
        String nombre, direccion, email, telefono;
        System.out.println("Introduce el nombre de la persona registrada que deseas modificar:");
        id = lee.nextLine();//INGRESAMOS EL NOMBRE DE LA PERSONA EN EL REGISTRO QUE QUEREMOS MODIFICAR
        int opcion=0;//ABRIMOS UNA OPCION PARA EL SWITCH, POR QUE PODEMOS CAMBIAR UNO O TODOS LOS ATRIBUTOS DEL REGISTRO DE UNA PERSONA
        do{
            try{//ENCAPSULAMOS EN UN TRY CATCH PARA VALIDAR EL ERROR DE NUMBERFORMATEXCEPTION, ES CUANDO METEN LETRAS EN DONDE SOLO DEBEN IR NUMEROS , SE CAUSA AL METER LETRAS EN UNA VARIABLE ENTERA
            System.out.println("1.Cambiar nombre");//MENU DE LA EDICION SWAG
            System.out.println("2.Cambiar direccion");
             System.out.println("3.Cambiar email");
              System.out.println("4.Cambiar telefono");
               System.out.println("5.Cambiar todo");
                System.out.println("6.Terminar edicion uvu");
                
            opcion=Integer.parseInt(lee.nextLine());//LEEMOS LA OPCION DEL MENU , TIENE QUE SER UN NUMERO 
            
            switch(opcion){//ABRIMOS EL SWTICH PARA LOS CASOS DEL MENU
                case 1:// ESTE CASO ES POR SI DESEAMOS CAMBIAR EL NOMBRE
                    for(int i=0;i<personas.size();i++){//BUSCAMOS PRIMERAMENTE SI EL REGISTRO SE ENCUENTRA EN LA LISTA RECORRIENDOLO
            if(id.equals(personas.get(i).getNombre())){//SI SE ENCUENTRA REALIZAMOS LO SIGUIENTE
                
                System.out.println("\n Ingrese el nombre");
                nombre = lee.nextLine();//LEEMOS EL CAMPO A EDITAR
                personas.set(i,new Persona(nombre,personas.get(i).getDireccion(),personas.get(i).getEmail(),personas.get(i).getTelefono()));//AGREGAMOS EL NUEVO ELEMENTO , EL METODO SET YA ESTA IMPLEMENTADO EN LOS ARRAYS LIST , POR LO CUAL ES FACIL
                break;// CORTAMOS SI LO ENCUENTRA PARA EVITAR BUSQUEDAS INNECESARIAS M Y MEJORAR EL TIEMPO DE EJECUCION
                /*NOTA , NO EXPLICARE LOS DEMAS YA QUE SON LOS MISMOS SOLO QUE CON UN ATRIBUTO DIFERENTE, NOTESE QUE SOLO LE PASAMOS EL NUEVO ATRIBUTO,
                LOS DEMAS SE QUEDAN IGUAL , Y UTLIZAMOS LOS METODOS GET IMPLEMENTADOS EN LA CLASE PERSONA, ESTO POR QUE EL CONTRCUTOR REQUIERE QUE MANDEMOS TODOS LOS PARAMETROS,
                PUDIMOS HABER HECHO , CONTRUCTORES QUE RECIBIERAN MENOS PARAMETROS PERO ES MAS CODIGO , MEJOR RECUPERAMOS DATOS SE VE MAS BONITO.
                */
            }
        } 
                     
                    break;
                case 2:
                             for(int i=0;i<personas.size();i++){
            if(id.equals(personas.get(i).getNombre())){
                System.out.println(" Ingrese la direccion");
                direccion = lee.nextLine();
                personas.set(i,new Persona(personas.get(i).getNombre(),direccion,personas.get(i).getEmail(),personas.get(i).getTelefono()));
                break;
            }
        } 
          
                    break;
                case 3:
                       for(int i=0;i<personas.size();i++){
            if(id.equals(personas.get(i).getNombre())){
                System.out.println(" Ingrese el email");
                email = lee.nextLine();
                personas.set(i,new Persona(personas.get(i).getNombre(),personas.get(i).getDireccion(),email,personas.get(i).getTelefono()));
                break;
            }
        } 
                    break;
                case 4:
                      for(int i=0;i<personas.size();i++){
            if(id.equals(personas.get(i).getNombre())){
                System.out.println("Ingrese el telefono");
                telefono = lee.nextLine();
                personas.set(i,new Persona(personas.get(i).getNombre(),personas.get(i).getDireccion(),personas.get(i).getEmail(),telefono));
                break;
            }
        } 
                    break;
                   
                case 5://ESTE CASO ES ESPECIAL , YA QUE SI SE QUIERE EDITAR TODO EL REGISTRO , LE PASAMOS TODOS LOS NUEVOS PARAMETROS , PERO SE QUEDA EN LA MISMA POSICION EN LA LISTA
        for(int i=0;i<personas.size();i++){// SI LO ELIMINAMOS , LA POSICION DE ESTE CAMBIARIA Y YA NO SERIA UNA EDICION :V
            if(id.equals(personas.get(i).getNombre())){
                System.out.println(" Ingrese el nombre");
                nombre = lee.nextLine();
                System.out.println(" Ingrese la direccion");
                direccion = lee.nextLine();
                System.out.println(" Ingrese el email");
                email = lee.nextLine();
                System.out.println(" Ingrese el telefono");
                telefono = lee.nextLine();
                personas.set(i,new Persona(nombre,direccion,email,telefono));
                break;
            }
        }
                break;
        }
            }catch(NumberFormatException n){
               System.out.println("Error solo se admiten numeros");// DE NUEVO , AQUI TAMBIEN VALIDAMOS DE EL ERROR DEL STRING QUERIENDO ENTRAR A UNA VARIABLE ENTERA
            }
        }while(opcion!=6);//CORTAMOS LA EDICION 
    }
    
}
