
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double sum1 = 0;
        double sum2 = 0;
        double avg = 0;
        do {
            System.out.println("Give a number: ");
            n = Integer.parseInt(scanner.nextLine());
            if (n != 0) {
                sum1 += n;
                sum2 ++;
                avg = sum1 / sum2;
            }
        } while (n != 0);
        System.out.println("Average of the numbers: " + avg);

    }
}
