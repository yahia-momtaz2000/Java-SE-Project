/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.essentials.conditions;

/**
 *
 * @author Administrator
 */
public class TestSwitchCase {
    public static void main(String[] args) {
        char gradeApprev = 'F';
        String grade;
       
        switch(gradeApprev){
            case 'A':
                grade = "Excellent";
                break;
            case 'B':
                grade = "V. Good";
                break;
            case 'C':
                grade = "Good";
                break;
            default :
                grade = "Un defined";
        }
        
        System.out.println("Grade = "+grade);
        
       /* if(gradeApprev == 'A'){
            grade = "Excellent";
        }else if(gradeApprev == 'B'){
            grade = "V.Good";
        }*/
        
        
    }
}
