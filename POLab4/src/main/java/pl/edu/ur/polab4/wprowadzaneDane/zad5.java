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
public class zad5 {
    
    public int bak;
    
    public  void main(String[] args)
    { 
        
    Student[] stud = new Student[100];
    for(int i=0; i<stud.length;i++)
    {
    stud[i]=new Student("","",0,"",0);
    }
    System.out.println("Podaj numer indeksu studenta u którego chcesz wprowadzić");
    Scanner a = new Scanner(System.in);
    bak=a.nextInt();
    stud[bak].wit();
    stud[bak].wip();
    
    }
    

    
    
}
