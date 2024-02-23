package hexlet.code.games;

import hexlet.code.MindGame;

import java.util.Random;

public final class CalcGame implements MindGame {
    private static final int OPERATOR_BOUND = 25;
    private static final int OPERAND_BOUND = 3;
    private String question;
    private String answer;
    private Random random;

    public CalcGame() {
        random = new Random();
    }
    public String getIntro() {
        return "What is the result of the expression?";
    }

    public void nextQuestion() {
        int operand1 = random.nextInt(OPERATOR_BOUND);
        int operand2 = random.nextInt(OPERATOR_BOUND);
        int operator = random.nextInt(OPERAND_BOUND);

        switch (operator) {
            case 0:
                question = operand1 + " + " + operand2;
                answer = Integer.valueOf(operand1 + operand2).toString();
                break;
            case 1:
                question = operand1 + " - " + operand2;
                answer = Integer.valueOf(operand1 - operand2).toString();
                break;
            case 2:
            default:
                question = operand1 + " * " + operand2;
                answer = Integer.valueOf(operand1 * operand2).toString();
                break;
        }
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
