package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUND_COUNT = 3;
    public static void runGame(String[][] questions, String description) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);

        int correctAnswers = 0;
        for (String[] question : questions) {
            System.out.println("Question: " + question[0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(question[1])) {
                System.out.println("Correct");
                correctAnswers++;
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                    + question[1] + "'");
                break;
            }
        }

        if (correctAnswers == ROUND_COUNT) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}
