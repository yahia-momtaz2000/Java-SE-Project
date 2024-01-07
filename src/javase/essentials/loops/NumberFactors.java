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
public class NumberFactors {
    public static void main(String[] args) {
        
        int number = 12;
        /// factors :  1, 2, 3, 4, 6, 12
        for(int i = 1; i <= number; i++){
             if(number % i == 0){
                  System.out.println(i);
             }
        }
        
    }
}
