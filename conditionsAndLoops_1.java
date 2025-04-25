//Area Of Circle Java Program

import java.util.Scanner;

public class conditionsAndLoops_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of radius : ");
        int radius = input.nextInt();
        double areaOfCircle = Math.PI*radius*radius;
        System.out.println("Area of circle with radius "+radius+" is "+areaOfCircle);
    }
}
