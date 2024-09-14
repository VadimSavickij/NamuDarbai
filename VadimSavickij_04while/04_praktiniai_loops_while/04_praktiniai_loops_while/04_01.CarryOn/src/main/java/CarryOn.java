
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textInput;
        do {
            System.out.println("Shall we carry on?");
            textInput = scanner.nextLine();
        }
        while (!textInput.equalsIgnoreCase("no"));

    }
}
