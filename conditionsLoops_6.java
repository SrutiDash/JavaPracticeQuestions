//Area Of Rhombus

import java.util.Scanner;

public class conditionsLoops_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of the rhombus : ");
        int base = input.nextInt();
        System.out.println("Enter the height of the rhombus : ");
        int height = input.nextInt();
        double areaOfRhombus = base*height;
        System.out.println("Area of rhombus with base "+base+" and  height "+height+" is "+areaOfRhombus);
    }
}
