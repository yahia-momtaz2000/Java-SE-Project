/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.essentials.loops;

/**
 *
 * @author Administrator
 */
public class TestLoops {
    public static void main(String[] args) {
        // print all numbers from 1 to 100
        System.out.println("------- for i loop--------------");
         int sum = 0;
        for(int i = 1; i < 101; i++ ){
            System.out.print(i+" ");  
            sum = sum + i;
        }
        System.out.println("\nsum = "+sum);
        double average = sum / 100.0;
        System.out.println("Average = "+average);
        System.out.println("----------- while loop -----------------------");
        int i = 1;
        sum = 0; // reset
        while(i < 101){
            System.out.print(i+" ");
            sum = sum + i;
            i++;
        }
        System.out.println("\nsum = "+sum);
        System.out.println("------------- do while loop ---------------"); 
        i = 1; // reset
        sum = 0;
        do{
            System.out.print(i+" ");
            sum = sum + i;
            i++;
        }while( i < 101 );
        System.out.println("\nsum = "+sum);
        
        
        
    }
}
