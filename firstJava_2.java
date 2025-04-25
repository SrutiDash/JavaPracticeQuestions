//Take name as input and print a greeting message for that particular name.
import java.util.Scanner;

public class firstJava_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name : ");
        String name = input.nextLine();
        System.out.println("Hi "+name+"! Nice to meet you.");
    }
}
