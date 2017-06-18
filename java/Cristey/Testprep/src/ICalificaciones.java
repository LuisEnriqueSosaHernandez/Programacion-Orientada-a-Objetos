/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristey
 */
import java.util.Scanner;
public class ICalificaciones {
    public static void main (String [] args){
    int opc,n;
    boolean b=true;
    String s="";
    Calificaciones obj1=new Calificaciones();
    Scanner entrada=new Scanner(System.in);
    do{      
    System.out.println("\n Calificaciones");
    System.out.println("1. INSERTAR LAS CALIFICACIONES DE LOS ALUMNOS");
    System.out.println("2. VER TODAS LAS CALIFICACIONES");
    System.out.println("3. VER PROMEDIO DE TODAS LAS CALIFICACIONES");
    System.out.println("4. VER LA CANTIDAD DEL ALUMNOS REPROBADOS");
    System.out.println("5. SALIR");
    System.out.println("ELIGE UNA OPCION:");
    opc=entrada.nextInt(); 
    switch (opc){        
     case 1:
            obj1.Lectura();
            b=false;
            break;
     case 2:
         if (b!=true){
            obj1.Escritura();}else {
             System.out.print("NO HAZ INGRESADO DATOS");}
            break;
     case 3:
            if (b!=true){
            obj1.Promedio();}else {
             System.out.print("NO HAZ INGRESADO DATOS");}
            break;
     case 4:
            if (b!=true){
            obj1.Reprobados();}else {
            System.out.print("NO HAZ INGRESADO DATOS");}
            break;
     case 5:System.out.print("Adios");
            break;
     default:
         System.out.print("OPCION ERRONEA");
    }
    }while (opc!=5);
}
}