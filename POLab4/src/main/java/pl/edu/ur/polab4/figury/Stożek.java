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
public class Stożek {
     public double H;
    public double r;
    public double l;
    public double ob;
  public  void main(){
    
    System.out.println(" Podaj wysokość stożka ");
    Scanner ja = new Scanner(System.in);
    H = ja.nextDouble();
    System.out.println(" Podaj promień podstawy stożka ");
    r = ja.nextDouble();
    System.out.println(" Podaj tworząca stożka ");
    l = ja.nextDouble();
    ob=(1/3)*Math.PI*r*r*H;
    System.out.println("objętość Stożka: "+ob);
    
}
  public void stożekwww()
    {   
        System.out.println("wysokość stożka: "+H);
        System.out.println("promień podstawy stożka: "+r);
        System.out.println("tworząca stożka: "+l);
        System.out.println("objętość Stożka: "+ob);
    
    }
    
}
