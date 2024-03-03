package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void runGame(String[][] questions, String description) {
        int i = 0;
        App.greeting();
        System.out.println(description);
        for (; i < questions[0].length; i++) {
            System.out.println("Question: " + questions[0][i]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();
            if (userAnswer.equals(questions[1][i])) {
                System.out.println("Correct");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                    + questions[1][i] + "'");
                break;
            }
        }

        if (i == questions.length) {
            System.out.println("Congratulations, " + App.getUserName() + "!");
        } else {
            System.out.println("Let's try again, " + App.getUserName() + "!");
        }
    }
}
