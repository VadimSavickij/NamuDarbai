
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum1 = 0;
        int sum2 = 0;
        do {
            System.out.println("Give a number: ");
            n = Integer.parseInt(scanner.nextLine());
            if (n != 0) {
                sum1 += n;
                sum2 ++;
            }
        } while (n != 0);
        System.out.println("Number of numbers: " + sum2);
        System.out.println("Sum of the numbers: " + sum1);

    }
}


