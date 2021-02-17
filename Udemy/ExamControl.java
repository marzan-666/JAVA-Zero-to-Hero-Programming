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
public class ExamControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SSC Result : ");
        int sscResult = sc.nextInt();
        System.out.println("Enter HSC Result : ");
        int hscResult = sc.nextInt();
        
        // OR operator >>>> 1 result should be true
        
        if(sscResult > 40 || hscResult >70){
            System.out.println("You can apply..");
        }
        else{
            System.out.println("You can not apply..");
        }
        
        
        // AND operator >>>> both result should be true
        
        System.out.println("Enter O level Result : ");
        int olevelResult = sc.nextInt();
        System.out.println("Enter A level Result : ");
        int alevelResult = sc.nextInt();
        
        if(olevelResult > 80 && alevelResult > 90){
            System.out.println("You can apply..");
        }
        else{
            System.out.println("You can not apply..");
        }
        
    }
}
