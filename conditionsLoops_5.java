//Area Of Parallelogram

import java.util.Scanner;

public class conditionsLoops_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of the parallelogram : ");
        int base = input.nextInt();
        System.out.println("Enter the perpendicular height of the parallelogram : ");
        int height = input.nextInt();
        double areaOfParallelogram = base*height;
        System.out.println("Area of parallelogram with base "+base+" and perpendicular height "+height+" is "+areaOfParallelogram);
    }
}
