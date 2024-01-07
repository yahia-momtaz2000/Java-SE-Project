/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.essentials.basics;

/**
 *
 * @author Administrator
 */
public class TestAverage {
    // psvm   Ctrl + space   main method 
     public static void main(String[] args) {
         // sout   ctrl + space
         System.out.println("Welcome to Java");
         // variables | data types
         // int   بتحمل ارقام صحيحة
         // doulbe  بتحمل ارقام عشرية
         int firstNumber = 4;
         int secondNumber = 6;
         int thirdNumber = 9;
     
       double average = (firstNumber + secondNumber + thirdNumber) / 3.0;
         System.out.println("Average = " + average); // +  concatenation
         
    }
}
