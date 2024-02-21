package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    private static final int MAX_ATTEMPS = 3;
    public static void runGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random random = new Random();
        int i = 0;
        for (; i < MAX_ATTEMPS; i++) {
            int number = random.nextInt(100);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();
            String rightAnswer = number % 2 == 0 ? "yes" : "no";
            if (userAnswer.equals(rightAnswer)) {
                System.out.println("Correct");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'");
                break;
            }
        }

        if (i == MAX_ATTEMPS) {
            System.out.println("Congratulations, " + Cli.getUserName() + "!");
        }
    }
}
