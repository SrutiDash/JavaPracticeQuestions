//Area Of Equilateral Triangle

import java.util.Scanner;

public class conditionsLoop_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the side of the triangle : ");
        int side = input.nextInt();
        double areaOfEquilaterlTriangle = (Math.sqrt(3)/4)*side*side;
        System.out.println("Area of equilateral triangle with side "+side+" is "+areaOfEquilaterlTriangle);
    }
}
