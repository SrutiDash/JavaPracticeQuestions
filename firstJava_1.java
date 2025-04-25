import java.util.Scanner;

public class firstJava_1 {
    public static void main(String[] args) {
        //Write a program to print whether a number is even or odd, also take input from the user.
        Scanner input = new Scanner(System.in);
        System.out.println("enter a natural number: ");
        int number = input.nextInt();
        if(number==0){
            System.out.println("please enter a natural number");
        }else if(number%2==0){
            System.out.println(number+" is even");
        }else{
            System.out.println(number+" is odd");
        }
    }
}
