package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int MAX_ATTEMPS = 3;

    public static void runGame(MindGame mindGame) {
        Cli.greeting();

        System.out.println(mindGame.getIntro());

        int i = 0;
        for (; i < MAX_ATTEMPS; i++) {
            mindGame.nextQuestion();
            System.out.println("Question: " + mindGame.getQuestion());
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();
            if (userAnswer.equals(mindGame.getAnswer())) {
                System.out.println("Correct");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                    + mindGame.getAnswer() + "'");
                break;
            }
        }

        if (i == MAX_ATTEMPS) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        } else {
            System.out.println("Let's try again, " + Cli.getUserName() + "!");
        }
    }
}
