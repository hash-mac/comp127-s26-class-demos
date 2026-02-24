package _0224_object_modeling_revisited;

import java.util.Arrays;
import java.util.Scanner;

public class Mastermind {
    private int numWins = 0;
    private int numLosses = 0;
    private MMColor[] code = new MMColor[4];
    private Round[] rounds = new Round[10];
    private int numRounds = 0;

    public Mastermind() {
        for(int i=0; i<code.length; i++) {
            code[i] = MMColor.getRanMmColor();
        }
    }

    public int[] makeGuess(MMColor guess[]) {
        rounds[numRounds] = new Round(guess, code);
        return rounds[numRounds++].getResponse();
    }

    public MMColor[] getCode() {
        return code;
    }

    public int getNumRounds() {
        return numRounds;
    }

    public static void main(String[] args) {
        Mastermind mm = new Mastermind();
        try (Scanner scanner = new Scanner(System.in)) {
            MMColor input[];
            int[] response;

            while(true) {
                input = Arrays.stream(scanner.nextLine().split(" "))
                .map(MMColor::valueOf)
                .toArray(MMColor[]::new);

                response = mm.makeGuess(input);
                System.out.println(Arrays.toString(response));

                if(response[0] == 4 || mm.getNumRounds() >= 10) break;
            }
        }
        System.out.println(Arrays.toString(mm.getCode()));
    }
}
