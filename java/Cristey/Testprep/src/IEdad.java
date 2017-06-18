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
public class IEdad {
    public static void main(String []args){
        Edad obj1=new Edad();
        Scanner entrada=new Scanner (System.in);
        int opc,year2;
        do
        {
            System.out.println("Selecciona Opcion");
            System.out.println("1. Calcular edad");
            System.out.println("2. Salir");
            opc=entrada.nextInt();
            switch (opc)
            {
                case 1:
                    System.out.print("Dame el año de nacimiento:");
                    year2=entrada.nextInt();
                    obj1.setYear2(year2);
                    System.out.println("la edad es: "+obj1.getEdad());
                    break;
                case 2:
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
                    break;
            }
        }
            while (opc!=2);            
    }        
}