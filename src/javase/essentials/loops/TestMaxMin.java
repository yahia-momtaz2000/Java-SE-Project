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
public class TestMaxMin {
    public static void main(String[] args) {
         // sum | average of 5 numbers input by keyboard
        Scanner input = new Scanner(System.in);
         int max = 0,  min = 0;
        for(int i = 0; i < 5; i++){
            System.out.println("Please Enter a no.");
                int number = input.nextInt();
                if( i == 0 ){
                    max = number;
                    min = number;
                }
                
                if(number > max){
                    max = number;
                }
                
                if(number < min){
                    min = number;
                }
                
        }
        
        System.out.println("max = "+max);
        System.out.println("min = "+min);
    }
}
