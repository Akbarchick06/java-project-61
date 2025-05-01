package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.NOD;
import hexlet.code.games.Progression; // Импортируем класс Progression

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!"); // Добавлено
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression"); // Добавлена опция для Progression
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
                if (Cli.name == null) {
                    Cli.greetUser();
                }
                Engine.runGame(Even.getGameInstruction(), new Even());
                break;
            case 3:
                if (Cli.name == null) {
                    Cli.greetUser();
                }
                Engine.runGame(Calc.getGameInstruction(), new Calc());
                break;
            case 4:
                if (Cli.name == null) {
                    Cli.greetUser();
                }
                Engine.runGame(NOD.getGameInstruction(), new NOD()
                );
                break;
            case 5: // Добавлена обработка выбора для Progression
                if (Cli.name == null) {
                    Cli.greetUser();
                }
                Engine.runGame(Progression.getGameInstruction(), new Progression()); // Запускаем игру Progression
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

