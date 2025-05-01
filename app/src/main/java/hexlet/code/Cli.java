package hexlet.code; // Убедитесь, что пакет правильный

import java.util.Scanner;

public class Cli {
    public static String name; // Публичная статическая переменная для хранения имени

    public static void greetUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        name = scanner.nextLine();  // Получаем имя от пользователя
    }

    public static String getName() { // Добавляем метод getName()
        if (name == null) {
            greetUser(); //  Если имя еще не получено, получите его
        }
        return name;
    }
}
