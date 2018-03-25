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
public class Kwadrat {
  public  double a;
   public double pole;
    public double obw;
  public  void main(){
    
    System.out.println(" Podaj bok a kwadratu ");
    Scanner ja = new Scanner(System.in);
    a = ja.nextDouble();
    pole=a*a;
    System.out.println("To teraz policzymy pole kwadratu: "+pole);
    obw=a*4;
    System.out.println("\nObwód tego kwadratu to: "+obw);
    
}
  public void kwadratwww()
    {   
        System.out.println("boka a kwadratu: "+a);
        System.out.println("Pole kwadratu: "+pole);
        System.out.println("obwód kwadratu: "+obw);
    
    }



}
