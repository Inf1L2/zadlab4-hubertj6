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
public class Prostokąt {
    public double a;
    public double b;
    public double pole;
    public double obw;
  public  void main(){
    
    System.out.println(" Podaj bok a prostokątu ");
    Scanner ja = new Scanner(System.in);
    a = ja.nextDouble();
    System.out.println(" Podaj bok b prostokątu ");
    b = ja.nextDouble();
    pole=a*b;
    System.out.println("To teraz policzymy pole prostokątu: "+pole);
    obw=2*a+2*b;
    System.out.println("\nObwód tego prostokątu to: "+obw);
    
}
  public void prostokątwww()
    {   
        System.out.println("boka a prostokątu: "+a);
        System.out.println("boka b prostokątu: "+b);
        System.out.println("Pole prostokątu: "+pole);
        System.out.println("obwód prostokątu: "+obw);
    
    }

   
    
}
