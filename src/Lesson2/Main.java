package Lesson2;

public class Main {
    public static void main(String[] args) {
        within10and20(13, 2);
        isPositiveOrNegative(-90);
        isNegative(7);
        printValueNLines("Test", 2);
    }

    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative(int value) {
        if (value >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }

    }

    public static boolean isNegative(int value) {
        if (value < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printValueNLines(String text, int value) {
        for (int i = 0; i < value; i++) {
            System.out.println("*");
        }
    }
}

