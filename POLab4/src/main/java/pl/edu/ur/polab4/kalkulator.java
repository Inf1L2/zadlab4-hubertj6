/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4;

import java.io.PrintStream;
import java.util.Scanner;
import pl.edu.ur.polab4.figury.Koło;
import pl.edu.ur.polab4.figury.Kula;
import pl.edu.ur.polab4.figury.Kwadrat;
import pl.edu.ur.polab4.figury.Prostokąt;
import pl.edu.ur.polab4.figury.Prostopadłościan;
import pl.edu.ur.polab4.figury.Stożek;
import pl.edu.ur.polab4.figury.Sześcian;

/**
 *
 * @author wlasciciel
 */
public class kalkulator {
   public static void main(String[] args)
   {
       int s;
       System.out.println("Jesłi chcesz wykonać zadanie 4 dla:\n Koła wpisz 1 \n Kuli wpisz 2\n Kwadratu wpisz 3\n Prostokąta wpisz 4\n Prostopadłościanu wpisz 5\n stożaka wpisz 6\n Sześcianu wpisz 7\n By zkaończyć wpisz cokolwiek innego");
       Scanner ja=new Scanner(System.in);
       s=ja.nextInt();
       switch(s)
       {
           case 1:
               Koło kołooo= new Koło();
               kołooo.main();
               kołooo.kołowww();
               break;
           case 2:
               Kula kulaaa= new Kula();
               kulaaa.main();
               kulaaa.kulawww();
               break;
            case 3:
               Kwadrat kwadra= new Kwadrat();
               kwadra.main();
               kwadra.kwadratwww();
               break;
            case 4:
               Prostokąt ooo= new Prostokąt();
               ooo.main();
               ooo.prostokątwww();
               break;
            case 5:
               Prostopadłościan pooo= new Prostopadłościan();
               pooo.main();
               pooo.prostopadłościanwww();
               break;
            case 6:
               Stożek sooo= new Stożek();
               sooo.main();
               sooo.stożekwww();
               break;
            case 7:
               Sześcian ssooo= new Sześcian();
               ssooo.main();
               ssooo.sześcianuwww();
               break;
            default:
                System.out.println("Koniec działania programu");
                
               
               
       
       }
   
   
   
   
   
   }
    
    
}
