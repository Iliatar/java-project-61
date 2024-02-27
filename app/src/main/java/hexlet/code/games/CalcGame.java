package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class CalcGame {
    private static final int OPERATOR_BOUND = 25;
    private static final int OPERAND_BOUND = 3;

    public static void runGame(int attempsCount) {
        System.out.println("What is the result of the expression?");
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
                default:
                    questions[i] = operand1 + " * " + operand2;
                    answers[i] = Integer.valueOf(operand1 * operand2).toString();
                    break;
            }
        }
        Engine.runGame(questions, answers);
    }
}
