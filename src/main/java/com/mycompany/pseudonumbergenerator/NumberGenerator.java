/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pseudonumbergenerator;

import java.math.BigInteger;
import java.util.LinkedList;



/**
 *
 * @author sefaonder
 */
public class NumberGenerator {
    //pseudo number generator class based on Blum Blum Shub Algorithm.
    int bound=0;
    final int p= 1567; //prime number 1
    final int q= 1571; //prime number 2
    
      private int randomNumber=0; //random number for previous generated numbers

    //to checking saving previous random number
    LinkedList<Integer> numberSpace = new LinkedList<Integer>();
   
   //int x0=7; //initial value for test
    
    public NumberGenerator(){}
    public NumberGenerator(int bound){
        this.bound = bound;
        
        
    }
    
    public int PseudoRandomGenerator(int initialValue,String studentNo){
        long M = this.p*this.q;
        long x=initialValue+randomNumber;
        String bits="";
 

        
        for(int i=0;i<100;i++){
            //according the formula x(n)=x(n-1)**2 % M
            x=(x*x)%M;
            
            //join end to end numbers
            bits+=x+"";
            
            //System.out.println("x:"+x);  
        }
        
        String seed="0."+bits.substring(35, 35+16)+studentNo;
        
        //check prev random number already exist
        
        numberSpace.forEach((index) -> {
            while (this.randomNumber == index) {
                this.randomNumber++;
            }
        });

        numberSpace.add(this.randomNumber);
        //System.out.println("list" + numberSpace);
        //return random number


        
       // System.out.println("seed: "+seed); 

        return (int)(Double.valueOf(seed)*this.bound)+1;
    }

    
}
