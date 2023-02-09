package com.mycompany.sum_of_digits;

import java.util.Scanner;

public class Sum_of_digits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number: ");
        int num = input.nextInt();
        int sum=0;
        while(num != 0){
        sum = sum + num%10;
        num /= 10;
        }
        System.out.println("Sum = "+sum);
        
        
        
        
    }
}
