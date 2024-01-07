/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.essentials.conditions;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TestRandomGame {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
    int correctAnswers = 0, wrongAnswers = 0;
       while( true ){
//        System.out.println(      (int)( Math.random() * 100 )    );
       int firstNumber =   (int)( Math.random() * 100 );
        int secondNumber =   (int)( Math.random() * 100 );
        
        System.out.println(firstNumber + " + "+ secondNumber + " = ");
       System.out.println("--- Enter -1 to Exit ----");
        int userResult =  input.nextInt();
             if(userResult == -1){
                 break;
             }
        
       if(userResult == (firstNumber + secondNumber) ){
           System.out.println("Correct Answer");
           correctAnswers++;
       }else{
           System.out.println("Wrong Answer");
           wrongAnswers++;
       } // end if 
       
   }  // end loop   
    
        System.out.println("No of Correct answers = "+correctAnswers);
        System.out.println("No of wrong answers = "+wrongAnswers);
       
    } // end main
} // end class
