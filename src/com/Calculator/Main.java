package com.Calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // while the program is running, ask the user for two numbers
        // once you have the two numbers ask for the operator, using a switch statement
        // return the answer
        // if the user types the char X then quit the application
        System.out.flush();
        welcomeMessage();

        int[] user_input;
        String operation;
        do {
            user_input = userInput();
            System.out.println("which operation '+ , -, *, /' " + " Or 'x' to exit the program");
            operation = operator();
            eval(operation, user_input);
            System.out.println("\n \n");
        }
        while (!operation.equals("x"));

    }

    public static void eval(String operation, int[] user_input) {
        System.out.print("Answer is ");
        switch (operation) {
            case "+":
                System.out.println(addTwoNumbers());
                break;
            case "-":
                System.out.println(subtractTwoNumbers(user_input[0], user_input[1]));
                break;
            case "*":
                System.out.println(multiplyTwoNumbers(user_input[0], user_input[1]));
                break;
            case "/":
                System.out.println(divideTwoNumbers(user_input[0], user_input[1]));
                break;
            default:
                System.out.println(
                        "Something we will never know, exiting the program \uD83D\uDE2D \uD83D\uDE2D \uD83D\uDE2D ");
                System.exit(0);
                break;
        }
    }

    public static int[] userInput() {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("First Number:");
//        int num1 = scanner.nextInt();
//        System.out.println("Second Number:");
//        int num2 = scanner.nextInt();
        ArrayList<Integer> someInt = new ArrayList<>();
        System.out.println("First Number:");
        someInt.add(scanner.nextInt());
        System.out.println("Second Number:");
        someInt.add(scanner.nextInt());
    }

    public static String operator() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void welcomeMessage() {
        String welcome = "Welcome to the Calculator App!" +
                " Lets do some maths!!! \uD83D\uDD25\uD83D\uDD25\uD83D\uDD25\uD83D\uDD25";
        System.out.println(welcome);
    }

    //    public static Integer addTwoNumbers(Integer num1, Integer num2) {
//        return num1 + num2;
//    }
    private static ArrayList<Integer> addTwoNumbers() {

    }

    public static Integer subtractTwoNumbers(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public static Integer multiplyTwoNumbers(Integer num1, Integer num2) {
        return num1 * num2;
    }

    public static double divideTwoNumbers(Integer num1, Integer num2) {
        return (double) num1 / num2;
    }


}
