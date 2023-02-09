/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fibonacci;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Fibonacci {

    public static void main(String[] args) {
        int n1=0,n2=1,n3,count;    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sequence number");
        count = input.nextInt();
        System.out.print(n1+", "+n2);
        for(int i=2;i<count;++i)
        {    
         n3=n1+n2;    
         System.out.print(", "+n3);    
         n1=n2;    
         n2=n3;    
        }    
  
    }
}
