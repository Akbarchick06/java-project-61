package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String name; // static
    public static void greetUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = scanner.nextLine(); // Присваиваем значение статической переменной
        System.out.println("Hello, " + name + "!");
    }
}
