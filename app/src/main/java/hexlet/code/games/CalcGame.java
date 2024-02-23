package hexlet.code.games;

import hexlet.code.MindGame;

import java.util.Random;

public class CalcGame implements MindGame {
    String question;
    String answer;
    Random random;

    public CalcGame() {
        random = new Random();
    }
    public String getIntro() {
        return "What is the result of the expression?";
    }

    public void nextQuestion() {
        int operand1 = random.nextInt(25);
        int operand2 = random.nextInt(25);
        int operator = random.nextInt(3);

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
