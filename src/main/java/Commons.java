import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Commons {

    public static void main(String[] args) {

        System.out.println("Dependency Management exercise is ready.");
    Scanner input = new Scanner(System.in);
        System.out.println("Enter something: ");
    String userInput = input.nextLine();
        System.out.println("You entered: " + userInput);
        System.out.println("You entered a number: " + StringUtils.isNumeric(userInput));
        System.out.println("Flipped case: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));



    }
}
