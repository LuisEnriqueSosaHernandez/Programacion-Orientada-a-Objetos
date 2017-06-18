/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristey
 */
public class Edad {
    private int year=2016;
    public int edad;
    public int year2;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year=year;
    }

    public int getEdad() {
        edad=(this.year-this.year2);
        return edad;
    }

    public void setEdad(int edad) {
        this.edad=edad;
    }

    public int getYear2() {
        return year2;
    }

    public void setYear2(int year2) {
        this.year2 = year2;
    }
    
}
