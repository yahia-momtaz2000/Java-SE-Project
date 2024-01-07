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
public class TestCalculator {
     public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
            
       int resultAdd =  firstNumber + secondNumber;
       int resultSubtract = firstNumber - secondNumber;
       int resultMultiply = firstNumber * secondNumber;
       
       // Casting : convert from int to double or from double to int
       double resultDivide = (double) firstNumber / secondNumber;
         
         System.out.println("Add = "+resultAdd);
         System.out.println("Subtract = "+resultSubtract);
         System.out.println("Multiplt = "+resultMultiply);
         System.out.println("Divide = "+resultDivide);
       
         System.out.println("----------------------------------");
         // increment   +1
          firstNumber++;
          firstNumber = firstNumber + 1;
          firstNumber += 1; // Augmented assignment
          System.out.println("first no after increment = "+firstNumber);
         // Decrement 
           firstNumber--;
           firstNumber = firstNumber - 1;
           firstNumber -= 1;
          System.out.println("first no after decrement = "+firstNumber);
          
          System.out.println("--------- pow | sqrt -------------");
           double powResult = Math.pow(  firstNumber ,  3  );
           System.out.println("Power result = "+powResult);
          
         double sqrtResult =  Math.sqrt(49);
         System.out.println("Sqrt Result = "+sqrtResult);
           
         System.out.println("------- round التقريب ----------");    
         double invoiceValue = 4237.678231;  // 4237.68
         //  4237.678231 * 100 = 423767.8231 | round = 423768  | / 100.0 = 4237.68 
             System.out.println(  Math.round( invoiceValue * 100 ) / 100.0 );
         System.out.println(    Math.round(invoiceValue )   );
         System.out.println("--------- casting ----------------");
     // Implicit Casting | widening | convert from int to double
         int empId = 101;
         double employeeId = empId;
         System.out.println(employeeId);
         
         // explicit casting | narrowing | convert from double to int
        double empSalary = 5000.66;   
         int empSal = (int)empSalary;
         System.out.println(empSal);
         
         System.out.println("------------ remainder   |   mod    |   %  -----------------");
           System.out.println( 4 / 2 ); // = 2
           System.out.println( 4 % 2 ); // = 0
           System.out.println(  11 % 3 ); // = 2
          
          System.out.println(143 % 3); // = 2
          System.out.println(5534538 % 10); // = 8
         
          int totalSeconds = 155;
          int minutes = totalSeconds / 60;
          System.out.println("Minutes = "+minutes);
           int remainingSeconds = totalSeconds % 60;
           System.out.println("Remaining seconds = "+remainingSeconds);
           int number = 9;
          if( number % 2 == 0 ){
              System.out.println("it is even no");
          }else{
              System.out.println("it is odd no");
          }
          
          System.out.println("-----------"); 
           int noBottles = 177;
           int boxCapacity = 9;
           int filledBoxes = noBottles / boxCapacity;
           System.out.println("Filled = "+filledBoxes);
           int remainingBottles = noBottles % boxCapacity;
           System.out.println("Remaining bottles = "+remainingBottles);
           
    }
}