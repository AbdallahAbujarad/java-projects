package com.mycompany.right_triangle_numbers;

import java.util.Scanner;

public class Right_triangle_numbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number of rows : ");
        int rows = input.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
