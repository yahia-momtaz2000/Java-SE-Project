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
public class TestEvenOddsArray {
    public static void main(String[] args) {
        
        int[] myArray = {7, 10, 45, 8, 18};  // array initialize
        int sumEven = 0, sumOdd = 0, countEven = 0, countOdd = 0;
        
        for(int item : myArray){
            if(item % 2 == 0){
                 sumEven = sumEven + item;
             countEven++;
            }else{
                 sumOdd = sumOdd + item;
             countOdd++;
            }
        }
   /*     
    for(int i = 0; i < myArray.length; i++){
        
        if(myArray[i] % 2 == 0 ){ // it is even
             sumEven = sumEven + myArray[i];
             countEven++;
         }else{
             sumOdd = sumOdd + myArray[i];
             countOdd++;
         }
         
    }
     */   
        System.out.println("Sum even = "+sumEven+", count even = "+countEven);   
        System.out.println("Sum odd = "+sumOdd+", count odd = "+countOdd);
    
    }
}
