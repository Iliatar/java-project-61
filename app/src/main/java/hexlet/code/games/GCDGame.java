package hexlet.code.games;

import hexlet.code.MindGame;

import java.util.Random;

public class GCDGame implements MindGame {
    String question;
    String answer;
    Random random;

    public GCDGame() {
        random = new Random();
    }
    public String getIntro() {
        return "Find the greatest common divisor of given numbers.";
    }

    public void nextQuestion() {
        int number1 = random.nextInt(100);
        int number2 = random.nextInt(100);
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
