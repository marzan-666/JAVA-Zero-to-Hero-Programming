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
public class DataTypes {
    public static void main(String[] args) {
        
        // Data type 
        
        byte b = 5; // 1 byte , numeric
        short s = 6; // 2 bytes , number
        int i = 99;  // 4 bytes , number
        float f = 56; // 4 bytes , float number
        double d = 99.9;// 8 bytes ,decimal number
        long l = 88; // 8 bytes , number
       
        char c = 'p'; // character ,2 bytes
        char c1 = 65; // ASCII value of A
    
        boolean isTrue = true; // true or false , 1 byte
                
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(l);
        System.out.println(c);
        System.out.println(c1);
        System.out.println(isTrue);
        
        // Arithmetic
        
        int a1 = 99;
        int b1 = 10;
        float f1 = 89;
        float f2 = 11;
        double d1 = 76.89;
        double d2 = 98.456;
        
        char c2 = 'A';
        char c3 = 'B';
        
        System.out.println(a1+b1);
        System.out.println(a1-b1);
        System.out.println(a1*b1);
        System.out.println(a1/b1);
        System.out.println(f1/f2);
        System.out.println(d1+d2);
        System.out.println(d1*d2);
        System.out.println(d2/d1);
        System.out.println(c1+c2);
        System.out.println(c1-c2);
        System.out.println(c1*c2);
        
        // Increment , Decrement
        
        int i1=10;
        i1++;
        System.out.println(i1);
        
        int j = 10;
        j--;
        System.out.println(j);
        
        i1 += 5;
        j -= 3;
        System.out.println(i1);
        System.out.println(j);
        
        // JAVA Casting
        
        // Narrowing type casting double > float > long > int > short > byte and vice versa Widening type casting
        
        int a3 = (int) 5.6;
        System.out.println(a3);
        
        double a4 = (int) 5.9;
        System.out.println(a4);
        
        double d3 = 5;
        int e = (int) d3; // Explicit casting
        
        int n = 9 ;
        double m = n; // Implicit casting
    }
}
