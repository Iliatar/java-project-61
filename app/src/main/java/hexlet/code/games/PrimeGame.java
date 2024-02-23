package hexlet.code.games;

import hexlet.code.MindGame;

import java.util.Random;

public class PrimeGame implements MindGame {
    String question;
    String answer;
    Random random;

    public PrimeGame() {
        random = new Random();
    }
    public String getIntro() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'";
    }

    public void nextQuestion() {
        int number = random.nextInt(100) + 1;
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
