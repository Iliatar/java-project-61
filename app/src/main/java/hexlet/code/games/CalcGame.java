package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class CalcGame {
    private static final int OPERAND_BOUND = 25;
    private static final int OPERATOR_BOUND = 3;

    private static final String DESCRIPTION = "What is the result of the expression?";

    public static void runGame() {
        String[][] questions = new String[Engine.ROUND_COUNT][2];
        char[] operators = new char[] {'+', '-', '*'};

        for (String[] question : questions) {
            int operand1 = Utils.generateNumber(OPERAND_BOUND);
            int operand2 = Utils.generateNumber(OPERAND_BOUND);
            char operator = operators[Utils.generateNumber(OPERATOR_BOUND)];

            question[0] = calcQuestion(operator, operand1, operand2);
            question[1] = calcAnswer(operator, operand1, operand2);
        }
        Engine.runGame(questions, DESCRIPTION);
    }

    private static String calcQuestion(char operator, int operand1, int operand2) {
        String result;

        switch (operator) {
            case '+':
                result = operand1 + " + " + operand2;
                break;
            case '-':
                result = operand1 + " - " + operand2;
                break;
            case '*':
                result = operand1 + " * " + operand2;
                break;
            default:
                throw new RuntimeException("Unknown input: " + operator);
        }

        return  result;
    }

    private static String calcAnswer(char operator, int operand1, int operand2) {
        String result;

        switch (operator) {
            case '+':
                result = Integer.valueOf(operand1 + operand2).toString();
                break;
            case '-':
                result = Integer.valueOf(operand1 - operand2).toString();
                break;
            case '*':
                result = Integer.valueOf(operand1 * operand2).toString();
                break;
            default:
                throw new RuntimeException("Unknown input: " + operator);
        }

        return  result;
    }
}
