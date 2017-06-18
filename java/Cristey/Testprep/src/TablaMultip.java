/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristey
 */

public class TablaMultip {
    public int i; 
    public int x; 
    public int numero;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }


    public int getX() { 
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void Imprimir(){
         for (i=0;i<=10;i++)
        {
         x=i*numero;
         System.out.print(+this.getNumero());
         System.out.print("*"+this.getI());
         System.out.println("="+this.getX() );
        }
    }
}   