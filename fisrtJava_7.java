//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

import javax.sql.rowset.FilteredRowSet;

public class fisrtJava_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to print fibonnaci series upto : ");
        int num = input.nextInt();
        //0 1 1 2 3 5 8 13 21 ....
       int firstNum = 0;
       int nextNum = 1;
       System.out.println("Fibonacci series : s");
       for(int i=1;i<=num;i++){
        System.out.println(firstNum);
        int sum = firstNum+nextNum;
        firstNum = nextNum;
        nextNum = sum;
       }
    }
}
