package org.example;

import java.util.Scanner;

public class LineComparsion1 {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program");
        double x1, y1, x2, y2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value for x1");
        x1 = scan.nextDouble();
        System.out.println("Enter value for y1");
        y1 = scan.nextDouble();
        System.out.println("Enter value for x2");
        x2 = scan.nextDouble();
        System.out.println("Enter value for y2");
        y2 = scan.nextDouble();
        double lengthOfLine = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Length of line is " + lengthOfLine);
    }
}
