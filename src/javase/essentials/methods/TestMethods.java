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
public class TestMethods {
    public static void main(String[] args) {
       int res =  add(5, 7);
        System.out.println("result = "+res);
        res = add(8, 16);
        System.out.println("result = "+res);
        System.out.println("result = "+add(10, 20));
        
       res =  subtract(15, 4);
        System.out.println("res subtract = "+res);
    } // end main
    
    public static int add(int a, int b){
         int result = a + b;
         return result;
    }
    public static int subtract(int a, int b){
        return a - b;
    }
} // end class
