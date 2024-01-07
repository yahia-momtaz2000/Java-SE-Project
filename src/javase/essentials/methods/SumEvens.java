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
public class SumEvens {

    public static void main(String[] args) {
        int[] myArray = {5, 4,6 ,8 ,10};
   int result = sumEvenNumbers(myArray);
        System.out.println(result + 100);
        System.out.println("sum Odd = "+sumOddNumbers(myArray));
        System.out.println("--------------");
        int[] secondArray = {5, 7, 8, 16, 20};
        result = sumEvenNumbers(secondArray);
          System.out.println(result);
          System.out.println("sum Odd = "+sumOddNumbers(secondArray));
    } // end main

    public static int sumEvenNumbers(int[] myArray) {
        int sumEven = 0;
        for (int item : myArray) {
            if (item % 2 == 0) {
                sumEven = sumEven + item;
            }
        }
        return sumEven;
    }
      public static int sumOddNumbers(int[] myArray) {
        int sumOdd = 0;
        for (int item : myArray) {
            if (item % 2 != 0) {
                sumOdd = sumOdd + item;
            }
        }
        return sumOdd;
    }
    
    
} // end class
