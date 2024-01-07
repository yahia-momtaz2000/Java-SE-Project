/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.essentials.arrays;

import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class TestArrays {
    public static void main(String[] args) {
         int n = 5;
        int[] myArray = new int[n];
        myArray[0] = 7;
        myArray[1] = 10;
        myArray[2] = 5;
        myArray[3] = 8;
        myArray[4] = 18;
        
        System.out.println(  Arrays.toString(myArray)   );
        System.out.println(myArray.length); 
        myArray[2] = 45;
        System.out.println(  Arrays.toString(myArray)   );
        
        System.out.println("------ loop using for i loop ---------------");    
        int sum = 0;
          for(int i = 0; i < myArray.length; i++){
              System.out.println(  myArray[i]  );
              sum = sum +  myArray[i];
          }
          System.out.println("Sum = "+sum);
          double average = (double)sum / myArray.length;
          System.out.println("Average = "+average);
        
        System.out.println("--------------- for each loop = enhanced loop -----------------");  
       for(int item : myArray) {
           System.out.println(item);
       }
          
    }
}