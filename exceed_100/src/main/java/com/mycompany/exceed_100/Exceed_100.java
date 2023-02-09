package com.mycompany.exceed_100;
import java.util.Scanner;
public class Exceed_100 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;
        while (sum < 100){
            System.out.print("Input number: ");
            number = input.nextInt();
            sum = sum + number;
        }
        System.out.println("Done Sum of numbers: "+sum);
        
    }
}
