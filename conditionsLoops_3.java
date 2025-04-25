//Area Of Rectangle Program

import java.util.Scanner;

public class conditionsLoops_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the base of the rectangle : ");
        int base = input.nextInt();
        System.out.println("enter the height of the rectangle : ");
        int height = input.nextInt();
        double areaOfRectangle = (base*height);
        System.out.println("Area of rectangle with base "+base+" and height "+height+" is "+areaOfRectangle);
    }
}
