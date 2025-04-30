package hexlet.code;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("0 - Exit");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.print("Your choice: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            Cli.greetUser();
        } else if (choice == 2) {
            Cli.greetUser();
            Even.isEven();
        } else {
            return;
        }

    }
}

