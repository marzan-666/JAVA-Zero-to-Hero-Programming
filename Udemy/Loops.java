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
public class Loops {
    public static void main(String[] args) {
        /*int s=0;
        
        // for loop
        for(int i=0; i<10; i++){
            s++;
            //System.out.println(i);
            //System.out.println(s);
        }
        // while loop
        int a=2;
        boolean b = true;
//        while(){
//            a++;
//            System.out.println(a);
//        }
        while(b){
            if(a>5){
                b = false;
            }
            a++;
            //System.out.println(a);
        }
        
        // Do while loop
        int d = 0;
        do{
            d++;
            System.out.println(d);
        }
        while(d < 20);*/
        
        ////// Banking Application
        
        Scanner sc = new Scanner (System.in);
        System.out.println("------Welcome to Banking Application-----");
        System.out.println("Press 1 to Withdraw Money..");        
        System.out.println("Press 2 to Deposit Money..");
        System.out.println("Press 3 to Exit the Application..");
        
        int operation = sc.nextInt();
        
        while(true){
            if(operation == 1){
                System.out.println("How much Money Do your Have?");
                int balance = sc.nextInt();
                System.out.println("Current Balance : "+balance+" BDT");
                System.out.println("How much Money Do you want to Withdraw?");
                int withdraw = sc.nextInt();
                if(balance > withdraw){
                    
                    System.out.println(withdraw+" BDT has been Withdrawn from your account..");
                    System.out.println("Current Balance: "+(balance-withdraw)+" BDT");
                    break;
                }
                else{
                    
                    System.out.println("You Do not have Sufficient Ammount to Withdraw..");
                    System.out.println("Please Try to Withdraw less than "+balance+ " BDT" );
                }
            }
            else if (operation == 2){
                System.out.println("How much Money Do your Have?");
                int balance = sc.nextInt();
                System.out.println("Current Balance : "+balance+" BDT");
                System.out.println("How much Money Do you want to Deposit?");
                int deposit = sc.nextInt();
                System.out.println("Current Balance : "+(balance+deposit)+" BDT");
                break;
            }
            else if (operation == 3){
                System.out.println("Application Terminated. . . ");
                break;
            }
            else{
                System.out.println("Invalid Input. . .");
                break;
            }
        }
        
    }
        
    }

