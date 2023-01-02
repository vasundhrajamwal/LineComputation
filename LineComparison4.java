package org.example;

import java.util.Scanner;

public class LineComparison4 {
    public static void main(String[] args){
        System.out.println("Welcome to Line Comparison Program");
        Line line1 = getLine();
        double lengthOfLine = getLength(line1);
        System.out.println("Length of line 1 is " + lengthOfLine);
        System.out.println("Enter value for second line");
        Line line2 = getLine();
        double lengthOfLine2 = getLength(line2);
        System.out.println("Length of line 2 is " + lengthOfLine2);
        System.out.println(line1);
        System.out.println(line2);
        if(line1.equals(line2))
            System.out.println("Both lines are equal");
        else
            System.out.println("Both lines are not equal");
    }
    public static Line getLine() {
        double x1,y1,x2,y2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value for x1");
        x1 = scan.nextDouble();
        System.out.println("Enter value for y1");
        y1 = scan.nextDouble();
        System.out.println("Enter value for x2");
        x2 = scan.nextDouble();
        System.out.println("Enter value for y2");
        y2 = scan.nextDouble();
        Line line = new Line(x1,y1,x2,y2);
        return line;
    }
    public static double getLength(Line line){
        double lengthOfLine = Math.sqrt(Math.pow(line.x2 - line.x1, 2) + Math.pow(line.y2 - line.y1, 2));
        return lengthOfLine;
    }
}
