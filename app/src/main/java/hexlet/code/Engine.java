package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int ROUNDS_COUNT = 3; // Максимальное количество раундов

    public static void runGame(String gameInstruction, GameLogic game) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(gameInstruction);

        String name = Cli.getName(); // Получаем имя пользователя

        System.out.println("Hello, " + name + "!");

        for (int i = 0; i < ROUNDS_COUNT; i++) {
            String[] questionAndAnswer = game.generateRound(); // Получаем вопрос и правильный ответ
            String question = questionAndAnswer[0];
            String correctAnswer = questionAndAnswer[1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return; // Прерываем игру при неправильном ответе
            }
            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
