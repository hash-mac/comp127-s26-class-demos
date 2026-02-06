package _0204_refactoring;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            input = scanner.nextLine();
            if(!input.equals("exit")) {
                System.err.println("You typed " + input);
            }
        } while(!input.equals("exit"));
        scanner.close();
    }
}
