/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.essentials.formulas;

/**
 *
 * @author Administrator
 */
public class ThreePartsFormula {
    public static void main(String[] args) {
      // inputs
        int x = 2, y = 3, a = 4, b = 5, c = 6;
        
       // process
         double part1 =  (3 + 4 * x) / 5.0;
         double part2 =  10.0 * ( y - 5 ) * ( a + b + c )  / x;
         double part3 = 9 * ( 4.0 / x    +   (9.0 + x) / y );
         double result =  part1 - part2 + part3;       
         
       // output 
        System.out.println("Result = "+result);
    }
}
