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
public class TestEmpAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Plz enter yout age");
          
// input
        int personAge = input.nextInt();
        
        // process & output
          if(personAge > 16){
            System.out.println("You are a man");
        }else if(personAge >= 11){ // 11 to 16
            System.out.println("You are a boy");
        }else{
            System.out.println("You are a child");
        }
        /*
        if(personAge > 16){
            System.out.println("You are a man");
        }else if(personAge >= 11 && personAge <= 16){ // 11 to 16
            System.out.println("You are a boy");
        }else{
            System.out.println("You are a child");
        }
                */
        
    }
}
