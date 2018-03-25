/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzaneDane;

import java.util.Scanner;

/**
 *
 * @author wlasciciel
 */
public class Student {

   
   public String imie="";
    public String nazwisko="";
     public int nr_indeksu=0;
      public String nazwaSpecjalności="";
       public int rok_studiow=0;

    public Student(String imie, String nazwisko, int nr_indeksu, String nazwaSpecjalności, int rok_studiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
        this.nazwaSpecjalności = nazwaSpecjalności;
        this.rok_studiow = rok_studiow;
    }
   

   
    public void wit()
    { 
        
        System.out.println("wprowadz dane studenta do wybranego indeksu: imie, nazwisko,nr indeksu, specjalność, rok");
        Scanner a = new Scanner(System.in);
        Student s1 = new Student(a.next(),a.next(),a.nextInt(),a.next(),a.nextInt());
   
        
     
    
    }public void nad()
    { 
        
        System.out.println("wprowadz dane studenta do wybranego indeksu: imie, nazwisko,nr indeksu, specjalność, rok");
        Scanner a = new Scanner(System.in);        
        Student s1 = new Student(a.next(),a.next(),a.nextInt(),a.next(),a.nextInt());
        
    }
    public void res()
    { 
        
        
        Scanner a = new Scanner(System.in);        
        Student s1 = new Student("","",0,"",0);
    }
    
     public void wip()
    {
        System.out.println(this.imie);
        System.out.println(this.nazwisko);
        System.out.println(this.nr_indeksu);
        System.out.println(this.nazwaSpecjalności);
        System.out.println(this.rok_studiow);
    
    
    }       
}
