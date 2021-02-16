/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Udemy;

/**
 *
 * @author user
 */
public class Arithmetic {
    public static void main(String[] args) {
        int a = 99;
        int b = 10;
        float f1 = 89;
        float f2 = 11;
        double d1 = 76.89;
        double d2 = 98.456;
        
        char c1 = 'A';
        char c2 = 'B';
        
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(f1/f2);
        System.out.println(d1+d2);
        System.out.println(d1*d2);
        System.out.println(d2/d1);
        System.out.println(c1+c2);
        System.out.println(c1-c2);
        System.out.println(c1*c2);
        
        // Increment , Decrement
        
        int i=10;
        i++;
        System.out.println(i);
        
        int j = 10;
        j--;
        System.out.println(j);
        
        i += 5;
        j -= 3;
        System.out.println(i);
        System.out.println(j);
        
        // JAVA Casting
        
        // Narrowing type casting double > float > long > int > short > byte and vice versa Widening type casting
        
        int a1 = (int) 5.6;
        System.out.println(a1);
        
        double a2 = (int) 5.9;
        System.out.println(a2);
        
        double d = 5;
        int e = (int) d; // Explicit casting
        
        int n = 9 ;
        double m = n; // Implicit casting
    }
}
