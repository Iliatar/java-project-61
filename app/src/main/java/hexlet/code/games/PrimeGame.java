package hexlet.code.games;

import hexlet.code.MindGame;

import java.util.Random;

public final class PrimeGame implements MindGame {
    private String question;
    private String answer;
    private Random random;

    public PrimeGame() {
        random = new Random();
    }
    public String getIntro() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public void nextQuestion() {
        int numberBound = 100;
        int number = random.nextInt(numberBound) + 1;
        question = Integer.valueOf(number).toString();
        answer = "yes";

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                answer = "no";
                break;
            }
        }
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
