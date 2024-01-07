/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javase.essentials.conditions;

import java.util.Date;


/**
 *
 * @author Administrator
 */
public class TestEmpTax {

    public static void main(String[] args) {
        // inputs 
        int empId = 101;
        String empName = "Ahmed Hassan";
        double empGrossSalary = 4000.0;
        String empJob = "Java Developer";
        char empGender = 'M';
        boolean isRetired = true;
        Date empHiredDate = new Date(); // today date
// if gross salary < 5000 >> THEN no tax = tax = 0
// if gross salary >= 5000 >>> THEN tax = 10 %
        int tax = 0;
            // 1 way if condition
        if( empGrossSalary >= 5000 ){
            tax = 10;
        }
        
        // process
        double monthlyNetSalary = empGrossSalary - empGrossSalary * tax / 100.0;
        double annualNetSalary = monthlyNetSalary * 12;

        // output 
        System.out.println("Monthly Net = " + monthlyNetSalary);
        System.out.println("Annual Net = " + annualNetSalary);

        System.out.println("Emp id = " + empId + ", name = " + empName + ", job = " + empJob
                + "\n\t, gender = " + empGender + ", is retired ? " + isRetired
                + ", hired on = " + empHiredDate);

        
    }
}
