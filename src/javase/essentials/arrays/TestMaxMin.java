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
public class TestMaxMin {
    public static void main(String[] args) {
        int[] myArray = {7, 10, 45, 8, 18};
        int max = myArray[0], min = myArray[0];
        
        for(int item : myArray){
            if(item  > max){
                max = item;
            }
            
            if(item < min){
                min = item;
            }
            
        }
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
        
    }
}
