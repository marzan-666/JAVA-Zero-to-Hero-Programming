/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udemy;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Statements {
        public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        
        if(n%2==0){
            System.out.println("EVEN number..");
        }else{
            System.out.println("ODD number..");
        }
        
        System.out.println("Enter a Value:");
        int num = sc.nextInt();
        
        if(num == 5){
            System.out.println("The numbre is 5");
        }else{
            System.out.println("The number is "+num);
        }
        
        System.out.println("Enter your age ");
        int age = sc.nextInt();
        
        if(age >= 18 && age <= 40 ){
            System.out.println("You will get the license and job as well..");
        }
        else if(age > 40 || age <  18 && age >0){
            System.out.println("You are not eligible..");
        }else{
            System.out.println("Wrong input..");
        }
                
         /// Switch Case 
        System.out.println("Enter your Marks");
        int marks = sc.nextInt();
        
        if(marks>0 && marks <= 100){
            
        switch(marks/10){
            case 10:
                System.out.println("You got A+");
                break;
            case 9:
                System.out.println("You got A");
                break;
            case 8:
                System.out.println("You got B+");
                break;
            case 7:
                System.out.println("You got B");
                break;
            case 6:
                System.out.println("You got C");
                break;
            case 5:
                System.out.println("You got D");
                break;
            case 4:
                System.out.println("You got F");
                break;
            default :
                System.out.println("Invalud Input. . .");
                break;
         }
                
        }
        else{
            System.out.println("Invalid Input. . .");
        }
    }
}
