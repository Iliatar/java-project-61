package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.GCDGame;
//import hexlet.code.games.*;
import hexlet.code.games.PrimeGame;
import hexlet.code.games.CalcGame;

import java.util.Scanner;

class App {
    private static final int ATTEMPS_COUNT = 3;
    private static String userName;
    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String userChoice = scanner.nextLine();

        switch (userChoice) {
            case "1":
                greeting();
                break;
            case "2":
                EvenGame.runGame(ATTEMPS_COUNT);
                break;
            case "3":
                CalcGame.runGame(ATTEMPS_COUNT);
                break;
            case "4":
                GCDGame.runGame(ATTEMPS_COUNT);
                break;
            case "5":
                ProgressionGame.runGame(ATTEMPS_COUNT);
                break;
            case "6":
                PrimeGame.runGame(ATTEMPS_COUNT);
                break;
            case "0":
                System.out.println("See you again! Exit application");
                break;
            default:
                System.out.println("Unknown command. Exit application");
                break;
        }
    }

    public static void greeting() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        //scanner.close();
    }

    public static String getUserName() {
        return  userName;
    }
}
