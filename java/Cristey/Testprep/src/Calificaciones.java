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
public class Calificaciones {
    int [] cal;
    int n;
    int c1 = 0;
    int cal2=0;
    float promedio;
    Scanner entrada=new Scanner(System.in);

     
     public void Lectura(){
         System.out.print("¿Cuantas calificaciones va a ingresar?");
         n=entrada.nextInt();
         cal=new int [n];
        for (int i=0;i<cal.length;i++){
            System.out.print("Dame la calificacion:");
            cal[i]=entrada.nextInt();
        }
     }
     public void Escritura(){
         for (int i=0;i<cal.length;i++)
         {
             System.out.println("El dato en la posicion:"+i+" Es la calificacion:"+cal[i]);         
         }
     }
     public void Promedio(){
         for (int i=0;i<cal.length;i++)
         {
             cal2=cal[i]+cal2;             
         }
         promedio= cal2/n;
         System.out.println("El promedio es:"+promedio);
     }
     public void Reprobados(){
         for (int i=0;i<cal.length;i++){
             if (cal[i]>=70){
             } else {
                 c1++;
             }
         }
         System.out.println("TOTAL DE REPROBADOS:"+c1);
     }
    
}