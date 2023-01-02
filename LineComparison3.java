package org.example;
import java.util.Scanner;

public class LineComparison3 {
    public static void main(String[] args) {
        Line line1 = getLine();
        double lengthOfLine = getLength(line1);
        System.out.println("Length of line 1 : " + lengthOfLine);
        System.out.println("Enter value for second line");
        Line line2 = getLine();
        double lengthOfLine2 = getLength(line2);
        System.out.println("Length of line 2 : " + lengthOfLine);
        System.out.println(line1);
        System.out.println(line2);
        if (lengthOfLine == lengthOfLine2) {
            System.out.println("Both lines are equal");
        }
        else if(lengthOfLine > lengthOfLine2){
            System.out.println("Line1 is greater than Line2");
        }
        else
            System.out.println("Lines2 is greater than Line1");
    }
    public static Line getLine(){
        double x1, y1, x2, y2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of x1 : ");
        x1 = scan.nextDouble();
        System.out.println("Enter value of y1 : ");
        y1 = scan.nextDouble();
        System.out.println("Enter value of x2 : ");
        x2 = scan.nextDouble();
        System.out.println("Enter value of y2 : ");
        y2 = scan.nextDouble();
        Line line = new Line(x1, y1, x2, y2);
        return line;
    }
    public static double getLength(Line line){
        double lengthOfLine = Math.sqrt(Math.pow(line.x2 - line.x1, 2) + Math.pow(line.y2 - line.y1, 2));
        return lengthOfLine;
    }
}
