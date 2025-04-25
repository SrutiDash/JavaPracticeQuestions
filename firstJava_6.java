//Input currency in rupees and output in USD.
import java.util.Scanner;

public class firstJava_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter money in rupees : ");
        int currency = input.nextInt();
        double CurrenyInUSD = 0.012*currency;
        System.out.println(currency+ "in USD is "+CurrenyInUSD);
    }
}
