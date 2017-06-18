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
public class ITablaMultip {
    public static void main (String [] args){
    int opc,numero,i;
        
    TablaMultip obj1= new TablaMultip();
    Scanner entrada= new Scanner (System.in);
    System.out.println("SELECCIONA UNA OPCION");
    System.out.println("1. MULTIPLICAR");
    System.out.println("2. SALIR");
    opc=entrada.nextInt();
    
    switch(opc)
    {
        case 1:
            System.out.print("dame un numero:");
            numero=entrada.nextInt();
            obj1.setNumero(numero);
            obj1.Imprimir();
            break;
        case 2:
            break;
        default:
            System.out.println("opcion invalida");
            break;
            
    }
}
}