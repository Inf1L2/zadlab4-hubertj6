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
public class Prostopadłościan {
    public double a;
    public double b;
    public double h;
    public double ob;
    public double obw;
  public  void main(){
    
    System.out.println(" Podaj bok a Prostopadłościan ");
    Scanner ja = new Scanner(System.in);
    a = ja.nextDouble();
    System.out.println(" Podaj bok b Prostopadłościan ");
    b = ja.nextDouble();
    System.out.println(" Podaj wyskość h Prostopadłościan ");
    h = ja.nextDouble();
    ob=a*b*h;
    System.out.println("objętość prostopadłościanu: "+ob);
    
}
  public void prostopadłościanwww()
    {   
        System.out.println("boka a prostopadłościanu: "+a);
        System.out.println("boka b prostopadłościanu: "+b);
        System.out.println("wysokość h prostopadłościanu "+h);
        System.out.println("objętość prostokątu: "+ob);
    
    }
    
}

    

