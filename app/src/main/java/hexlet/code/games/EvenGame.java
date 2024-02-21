package hexlet.code.games;

import hexlet.code.MindGame;

import java.util.Random;

public class EvenGame implements MindGame {
    String question;
    String answer;
    Random random;

    public EvenGame() {
        random = new Random();
    }

    public String getIntro() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public void nextQuestion() {
        Integer number = random.nextInt(100);
        question = number.toString();
        answer = number % 2 == 0 ? "yes" : "no";
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
