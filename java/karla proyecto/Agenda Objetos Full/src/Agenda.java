import com.sun.corba.se.impl.io.IIOPOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class Agenda {

   
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
       
        FileOutputStream file=new FileOutputStream("Agenda\\Registro.txt");//Para darle un destino al archivo, y el metodo para escribir, crearlo
        ObjectOutputStream out = new ObjectOutputStream(file);
        Persona coco=new Persona("Jose","matamoros","kiquesase",15);//para crear un nuevo objeto de la clase coco
        out.writeObject(coco);//para Escribir el objeto en un archivo(Todos sus parametros
        Persona co=new Persona("Josdfse","masdfsd","kiqsfdsfdase",15);
       out.writeObject(co);//Para crear otro objeto con distintos datos
       out.flush();
        out.close();
       FileInputStream file2=new FileInputStream("Agenda\\Registro.txt");//Para leer el archivo creado
        ObjectInputStream in= new ObjectInputStream(file2);
        Persona coci=(Persona)in.readObject();//1.-leer preimier objetoya almacene el primero objeto<<<<
       Persona coc=(Persona)in.readObject();//2.-lee el segundo objetopara imprimir el segundo objecto
        System.out.println(coci.toString());
        System.out.println(coc.toString());
        /*Scanner lee =new Scanner(System.in);
        int a=lee.nextInt();*/
        //lee.nextInt();
    }
    
}