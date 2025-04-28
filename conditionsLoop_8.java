//Perimeter of circle

import java.util.Scanner;

public class conditionsLoop_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius of the circle : ");
        int radius = input.nextInt();
        double perimeterOFCircle = 2*Math.PI*radius;
        System.out.println("Perimeter of circle with radius "+radius+" is "+perimeterOFCircle);
    }
}
