package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void runGame(String[] questions, String[] answers) {
        int i = 0;
        for (; i < questions.length; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();
            if (userAnswer.equals(answers[i])) {
                System.out.println("Correct");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                    + answers[i] + "'");
                break;
            }
        }

        if (i == questions.length) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        } else {
            System.out.println("Let's try again, " + Cli.getUserName() + "!");
        }
    }
}
