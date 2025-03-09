/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dollars.java;

/**
 *
 * @author mutak
 */import java.util.Scanner;
public class DollarsJava {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
       
        int twenties,tens,fives,ones;
         System.out.print("Enter the amount in dollars:");
        
        int amount = input.nextInt();
        twenties = amount ;
        tens = amount ;
        fives  = amount ;
        ones = amount ;
        
        System.out.println("Conversion");
                System.out.println("Twenties:"+twenties/20);
                System.out.println("Tens:"+tens/10);
                System.out.println("Fives"+fives/5);
                System.out.println("Ones"+ones);
        
        
        System.out.println("Hello World!");
    }
}
