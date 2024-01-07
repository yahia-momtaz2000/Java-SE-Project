/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.essentials.methods;

/**
 *
 * @author Administrator
 */
public class PrintNumbers {
    public static void main(String[] args) {
         printValues();
         printValues();
         printValues();
         double sum = sumNumbers();
         System.out.println("Sum of numbers from 1 to 100 = "+sum);
    } // end main
    
    public static void printValues(){
        for(int i = 1; i < 101; i++){
            System.out.print(i+" ");
        }
        System.out.println("");
    } // end printValues method
    
    public static double sumNumbers(){
        double sum = 0;  
        for(int i = 1; i < 101; i++)  {
              sum = sum + i;
          }
        return sum;
    }
    
} // end class
