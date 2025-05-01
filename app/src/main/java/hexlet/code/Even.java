package hexlet.code.games;

import hexlet.code.GameLogic;
import java.util.Random;

public class Even implements GameLogic {

    private static final String GAME_INSTRUCTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    @Override
    public String[] generateRound() {
        Random random = new Random();
        int number = random.nextInt(100);
        String question = String.valueOf(number);
        String correctAnswer = (number % 2 == 0) ? "yes" : "no";
        return new String[]{question, correctAnswer};
    }
    public static String getGameInstruction() {
        return GAME_INSTRUCTION;
    }
}
