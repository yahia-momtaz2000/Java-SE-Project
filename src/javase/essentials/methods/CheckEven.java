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
public class CheckEven {
    public static void main(String[] args) {
          int num = 17;
         boolean b =  chkEven(num);
         System.out.println("Is even ? "+b);
    } // end main
    public static boolean chkEven(int number){
         // return (number % 2 == 0 ? true : false);   /// ternary operator
        return (number % 2 == 0);   /// ternary operator
        /*
        boolean b = false;
            if(number % 2 == 0){
                b = true;
            }
        return b;
        */
      /*    if(number % 2 == 0){
              return true;
          }else{
              return false;
          }
              */
    }
    
} // end class
