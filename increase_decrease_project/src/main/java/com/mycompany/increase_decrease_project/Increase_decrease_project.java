/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.increase_decrease_project;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Increase_decrease_project {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");Double a = input.nextDouble();
        System.out.print("Input second number: ");Double b = input.nextDouble();
        System.out.print("Input third number: ");Double c = input.nextDouble();
        
        if(a>b && b>c)
        {
            System.out.println("Decreasing order");
        }else if(a<b && b<c)
        {
            System.out.println("Increasing order");
        }else
        {
            System.out.println("Neither increasing or decreasing order");
        }
        
        
    }
}
