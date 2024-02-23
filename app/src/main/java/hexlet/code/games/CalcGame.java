package hexlet.code.games;

import hexlet.code.MindGame;

import java.util.Random;

public final class CalcGame implements MindGame {
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
        int operatorBound = 25;
        int operandBound = 3;
        int operand1 = random.nextInt(operatorBound);
        int operand2 = random.nextInt(operatorBound);
        int operator = random.nextInt(operandBound);

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
