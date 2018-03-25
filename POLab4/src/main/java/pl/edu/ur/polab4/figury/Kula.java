/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.figury;

import java.util.Scanner;

/**
 *
 * @author wlasciciel
 */
public class Kula {
    public double promien;
    public double objętość;
    
    public void main()
    {
    System.out.println(" Podaj promień kuli ");
    Scanner ja = new Scanner(System.in);
    promien = ja.nextDouble();
    objętość=4*Math.PI+promien*promien;
    System.out.println("Objętość kuli: "+objętość);
    
    
    }
    public void kulawww()
    {
        System.out.println("Promień kuli: "+promien);
        System.out.println("Objętość kuli: "+objętość);
    }
}
