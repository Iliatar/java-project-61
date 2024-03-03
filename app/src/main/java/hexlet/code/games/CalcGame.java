package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class CalcGame {
    private static final int OPERATOR_BOUND = 25;
    private static final int OPERAND_BOUND = 3;

    private static final String DESCRIPTION = "What number is missing in the progression?";

    public static void runGame(int attempsCount) {
        Random random = new Random();
        String[] questions = new String[attempsCount];
        String[] answers = new String[attempsCount];

        for (int i = 0; i < attempsCount; i++) {
            int operand1 = random.nextInt(OPERATOR_BOUND);
            int operand2 = random.nextInt(OPERATOR_BOUND);
            int operator = random.nextInt(OPERAND_BOUND);

            switch (operator) {
                case 0:
                    questions[i] = operand1 + " + " + operand2;
                    answers[i] = Integer.valueOf(operand1 + operand2).toString();
                    break;
                case 1:
                    questions[i] = operand1 + " - " + operand2;
                    answers[i] = Integer.valueOf(operand1 - operand2).toString();
                    break;
                case 2:
                    questions[i] = operand1 + " * " + operand2;
                    answers[i] = Integer.valueOf(operand1 * operand2).toString();
                    break;
                default:
                    throw new RuntimeException("Unknown input: " + operator);
            }
        }
        Engine.runGame(new String[][]{questions, answers}, DESCRIPTION);
    }
}
