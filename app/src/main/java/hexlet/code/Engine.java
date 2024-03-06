package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUND_COUNT = 3;
    public static void runGame(String[][] questions, String description) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);

        for (; i < questions[0].length; i++) {
            System.out.println("Question: " + questions[0][i]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(questions[1][i])) {
                System.out.println("Correct");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                    + questions[1][i] + "'");
                break;
            }
        }

        if (i == questions[0].length) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}
