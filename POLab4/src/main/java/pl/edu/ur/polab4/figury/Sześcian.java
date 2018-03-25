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
public class Sześcian {
   public  double a;
   
    public double ob;
  public  void main(){
    
    System.out.println(" Podaj bok a Sześcianu ");
    Scanner ja = new Scanner(System.in);
    a = ja.nextDouble();
    ob=a*a*a;
    System.out.println("To teraz policzymy objętość Sześcian: "+ob);
    
}
  public void sześcianuwww()
    {   
        System.out.println("boka a sześcianu: "+a);
        System.out.println("obwód sześcainu: "+ob);
        
    
    }
}
