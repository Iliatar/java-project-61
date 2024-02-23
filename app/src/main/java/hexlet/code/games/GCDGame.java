package hexlet.code.games;

import hexlet.code.MindGame;

import java.util.Random;

public final class GCDGame implements MindGame {
    private static final int NUMBER_BOUND = 100;
    private String question;
    private String answer;
    private Random random;

    public GCDGame() {
        random = new Random();
    }
    public String getIntro() {
        return "Find the greatest common divisor of given numbers.";
    }

    public void nextQuestion() {
        int number1 = random.nextInt(NUMBER_BOUND);
        int number2 = random.nextInt(NUMBER_BOUND);
        question = number1 + " " + number2;
        int answerNumber = number1 > number2 ? getGCD(number1, number2) : getGCD(number2, number1);
        answer = Integer.valueOf(answerNumber).toString();
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    private int getGCD(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return getGCD(number2, number1 % number2);
    }
}
