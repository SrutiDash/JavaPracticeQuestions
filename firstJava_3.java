//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class firstJava_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter principal : ");
        int principal = input.nextInt();
        System.out.println("enter rate : ");
        int rate = input.nextInt();
        System.out.println("enter time : ");
        int  time= input.nextInt();
        double SimpleInterest = (principal*rate*time)/100;
        System.out.println("SimpleInterest is "+SimpleInterest);
    }
}
