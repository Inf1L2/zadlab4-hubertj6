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
public class Koło {

  
    public double promien;
    public double pole;
    public double obw;
    public  void main(){
    
    System.out.println(" Podaj promień kołą ");
    Scanner ja = new Scanner(System.in);
    promien = ja.nextDouble();
    pole=(promien*promien)*Math.PI;
    System.out.println("To teraz policzymy pole koła: "+pole);
    obw=2*Math.PI*promien;
    System.out.println("\nObwód tego kołą to: "+obw);
    }
    public void kołowww()
    {   
        System.out.println("Promień koła: "+promien);
        System.out.println("Pole policzonego koła: "+pole);
        System.out.println("obwód koła: "+obw);
    
    }

    

    
    
}

