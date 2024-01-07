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
public class TestCircleArea {
    public static void main(String[] args) {
        // inputs ,  PI   Constant قيمة ثابتة
       // final double PI = 3.145;
       
        double radius = 5;
        
        // process
          double area = Math.PI * Math.pow(radius, 2);
              area = Math.round( area * 100 ) / 100.0;
          
        // output 
         System.out.println("Area = "+area);
    }
}