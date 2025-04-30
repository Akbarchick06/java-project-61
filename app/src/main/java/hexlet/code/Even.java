package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void isEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random random = new Random(1) ;

        int correctAnswers = 0;
        int rounds = 3;

        while (correctAnswers < rounds) {
            int randomNumber = random.nextInt(100);
            System.out.println("Question: " + randomNumber);
            System.out.print("Your choice: ");
            String userAnswer = scanner.nextLine();

            boolean isEven = randomNumber % 2 == 0;
            String correctAnswer = isEven ? "yes" : "no";

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
                correctAnswers++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + Cli.name  + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + Cli.name + "!");
    }
}
