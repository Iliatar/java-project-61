package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.PrimeGame;

import java.util.Scanner;

class App {
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
                Cli.greeting();
                break;
            case "2":
                Engine.runGame(new EvenGame());
                break;
            case "3":
                Engine.runGame(new CalcGame());
                break;
            case "4":
                Engine.runGame(new GCDGame());
                break;
            case "5":
                Engine.runGame(new ProgressionGame());
                break;
            case "6":
                Engine.runGame(new PrimeGame());
                break;
            case "0":
                System.out.println("See you again! Exit application");
                break;
            default:
                System.out.println("Unknown command. Exit application");
                break;
        }
    }
}