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
public class CountOccurence {
    public static void main(String[] args) {
        int[] myArray = {6, 5, 8, 10, 6};
       int counter = countOccur(myArray, 6);
        System.out.println("Counter = "+counter);
    } // end main
    public static int countOccur(int[] myArray, int number){
          int counter = 0;
        for(int item : myArray){
            if(number == item){
                counter++;
            }
        }
        return counter;
    }
    
    
} // end class
