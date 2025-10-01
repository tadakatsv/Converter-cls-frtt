package app;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("App for converting fahrenheit to celsius and vice versa");
        byte choice  = getUserChoice();
        System.out.println("enter the number which one to convert");
        double number = scanner.nextDouble();
        switch (choice) {
            case 1:
                System.out.println("here your celsius:" + String.format("%.3f",convFarToCel(number)));
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    private static double convFarToCel(double fahrenheit) {
        return ((fahrenheit - 32) * 5/9);
    }


    private static byte getUserChoice() {
        System.out.println("Same converter, but now through SSH");
        System.out.println("1:For fahrenheit to celsius");
        return scanner.nextByte();
    }
}