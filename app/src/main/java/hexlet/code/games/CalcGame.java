package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class CalcGame {
    private static final int OPERAND_BOUND = 25;
    private static final int OPERATOR_BOUND = 3;

    private static final String DESCRIPTION = "What is the result of the expression?";

    public static void runGame() {
        String[] questions = new String[Engine.ROUND_COUNT];
        String[] answers = new String[Engine.ROUND_COUNT];

        for (int i = 0; i < Engine.ROUND_COUNT; i++) {
            int operand1 = Utils.generateNumber(OPERAND_BOUND);
            int operand2 = Utils.generateNumber(OPERAND_BOUND);
            int operator = Utils.generateNumber(OPERATOR_BOUND);

            questions[i] = calcQuestion(operator, operand1, operand2);
            answers[i] = calcAnswer(operator, operand1, operand2);
        }
        Engine.runGame(new String[][]{questions, answers}, DESCRIPTION);
    }

    private static String calcQuestion(int operator, int operand1, int operand2) {
        String result;

        switch (operator) {
            case 0:
                result = operand1 + " + " + operand2;
                break;
            case 1:
                result = operand1 + " - " + operand2;
                break;
            case 2:
                result = operand1 + " * " + operand2;
                break;
            default:
                throw new RuntimeException("Unknown input: " + operator);
        }

        return  result;
    }

    private static String calcAnswer(int operator, int operand1, int operand2) {
        String result;

        switch (operator) {
            case 0:
                result = Integer.valueOf(operand1 + operand2).toString();
                break;
            case 1:
                result = Integer.valueOf(operand1 - operand2).toString();
                break;
            case 2:
                result = Integer.valueOf(operand1 * operand2).toString();
                break;
            default:
                throw new RuntimeException("Unknown input: " + operator);
        }

        return  result;
    }
}
