//Area Of Triangle

import java.util.Scanner;

public class conditionsLoops_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the base of the triangle : ");
        int base = input.nextInt();
        System.out.println("enter the height of the triangle : ");
        int height = input.nextInt();
        double areaOfTriangle = (base*height)/2;
        System.out.println("Area of triangle with base "+base+" and height "+height+" is "+areaOfTriangle);
    }
}
