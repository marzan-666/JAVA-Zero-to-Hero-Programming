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
public class Bank {
    public static void main(String[] args) {
        //int balance = 1000 ;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------Welcome to Banking Application--------");
        System.out.println("Press 1 to Exit the Application..");
        System.out.println("Press 2 to Deposit Money..");
        System.out.println("Press 3 to Withdraw Money...");
        
        int operation = sc.nextInt();
        if(operation == 1){
            System.out.println("Applicaton terminated...");
        }
        else if(operation == 2){
            System.out.println("How much Money Do your Have?");
            int balance = sc.nextInt();
            System.out.println("Current Balance : "+balance+" BDT");
            System.out.println("How much Money Do you want to Deposit?");
            int deposit = sc.nextInt();
            System.out.println("Current Balance : "+(balance+deposit)+" BDT");
        }
        else if(operation == 3){
            System.out.println("How much Money Do your Have?");
            int balance = sc.nextInt();
            System.out.println("Current Balance : "+balance+" BDT");
            System.out.println("How much Money Do you want to Withdraw?");
            int withdraw = sc.nextInt();
            if(balance > withdraw){
                System.out.println(withdraw+" BDT has been Withdrawn from your account..");
                System.out.println("Current Balance: "+(balance-withdraw)+" BDT");
            }
            else{
                System.out.println("You Do not have Sufficient Ammount to Withdraw..");
                System.out.println("Please Try to Withdraw less than "+balance+ " BDT" );
            }
            
        }
        else{
            System.out.println("Invalid Input...");
        }
        
        
    }
}
