//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class firstJava_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int num1 = input.nextInt();
        System.out.println("Enter your second number : ");
        int num2 = input.nextInt();
        System.out.println("Enter your operator from +,-,*,/ : ");
        char operator= input.next().charAt(0);
        System.out.println("Result : ");
        if(operator == '+'){
            System.out.println(num1+num2);
        }else if(operator == '-'){
            System.out.println(num1-num2);
        }else if(operator == '*'){
            System.out.println(num1*num2);
        }else if(operator == '/'){
            System.out.println(num1/num2);
        }else{
            System.out.println("Invalid operator");
        }
    }
}
