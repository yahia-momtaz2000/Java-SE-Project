/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.essentials.arrays;

/**
 *
 * @author Administrator
 */
public class CountOccurence {
    public static void main(String[] args) {
        // find no of appearance of a number in array
        int number = 6;
        int[] myArray = {2, 6, 6, 3, 6};
        
          int counter = 0;
        for(int item : myArray){
            if(item == number){
                counter++;
            }
        }
        
        System.out.println("Count of occurence = "+counter);  
        
    }
}
