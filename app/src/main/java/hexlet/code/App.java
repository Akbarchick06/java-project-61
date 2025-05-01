package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        switch (choice) {
            case 0:
                System.out.println("Goodbye!");
                return;
            case 1:
                Cli.greetUser();
                break;
            case 2:
                Engine.runGame(Even.getGameInstruction(), new Even()); //  Запускаем игру Even
                break;
            case 3:
                Engine.runGame(Calc.getGameInstruction(), new Calc()); // Запускаем игру Calc
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

