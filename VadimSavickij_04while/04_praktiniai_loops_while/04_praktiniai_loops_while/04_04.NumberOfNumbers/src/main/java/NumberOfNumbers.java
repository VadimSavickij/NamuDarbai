
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;
        do {
            System.out.println("Give a number: ");
            n = Integer.parseInt(scanner.nextLine());
            if (n != 0){
                sum ++;
            }
        }while (n != 0);
        System.out.println("Number of numbers " + sum);
    }
}