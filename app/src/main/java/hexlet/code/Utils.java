package hexlet.code;

public class Utils {
    public static int generateNumber(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min)) + min;
    }

    public static int generateNumber(int max) {
        return generateNumber(0, max);
    }
}
