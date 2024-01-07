/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.essentials.loops;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TestSumEvenOdd {
    public static void main(String[] args) {
         // sum | average of 5 numbers input by keyboard
        Scanner input = new Scanner(System.in);
         int sumEven = 0, sumOdd = 0, countEven = 0, countOdd = 0;
        for(int i = 0; i < 5; i++){
            System.out.println("Please Enter a no.");
                int number = input.nextInt();
                if(number % 2 == 0){ // even no
                    sumEven = sumEven + number;
                    countEven++;
                }else{ // odd no
                    sumOdd = sumOdd + number;
                    countOdd++;
                }
        }
        
        System.out.println("Sum Even = "+sumEven+", count even = "+countEven);
        System.out.println("Sum Odd = "+sumOdd+", count odd = "+countOdd);
    }
}
