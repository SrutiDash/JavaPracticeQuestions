//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class firstJava_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int number1 = input.nextInt();
        System.out.println("Enter the second number : ");
        int number2 = input.nextInt();
        if(number1>number2){
            System.out.println(number1+" is largest");
        }else if(number2>number1){
            System.out.println(number2+" is largest");   
        }else{
            System.out.println("both are similar");
        }
    }
}
