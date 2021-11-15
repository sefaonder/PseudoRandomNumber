/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pseudonumbergenerator;

/**
 *
 * @author sefaonder
 */
public class NewClass {
    public static void main(String[] args) {
        
        int soru_1, soru_2, soru_3, soru_4, soru_5, soru_yedek_6, soru_yedek_7;
        NumberGenerator rand= new NumberGenerator(40); //set bound

        //
        soru_1 = rand.PseudoRandomGenerator(12, "032090003");
        soru_2 = rand.PseudoRandomGenerator(soru_1, "032090003");
        soru_3 = rand.PseudoRandomGenerator(soru_2, "032090003");
        soru_4 = rand.PseudoRandomGenerator(soru_3, "032090003");
        soru_5 = rand.PseudoRandomGenerator(soru_4, "032090003");
        soru_yedek_6 = rand.PseudoRandomGenerator(soru_5, "032090003");
        soru_yedek_7 = rand.PseudoRandomGenerator(soru_yedek_6, "032090003");

        //print the questions to console
        System.out.println("soru_1: " + soru_1);
        System.out.println("soru_2: " + soru_2);
        System.out.println("soru_3: " + soru_3);
        System.out.println("soru_4: " + soru_4);
        System.out.println("soru_5: " + soru_5);
        System.out.println("soru_6: " + soru_yedek_6);
        System.out.println("soru_7: " + soru_yedek_7);
        
      
       
       
    }
    
}
